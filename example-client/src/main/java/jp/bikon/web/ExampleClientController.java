package jp.bikon.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import jp.bikon.config.ExampleRibbonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright (c) 2016 Jase Batchelor. All rights reserved.
 *
 * @author jase
 */
@RestController
@RibbonClient(name = "example", configuration = ExampleRibbonConfiguration.class)
public class ExampleClientController {

    @Autowired
    private RestTemplate restTemplate;

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @HystrixCommand(fallbackMethod = "handleFallback")
    @RequestMapping("/balance")
    public String getMessageFromExampleApplication() {

        // The URL of the service as registered in Eureka - eg. 'example'
        final String serviceUrl = "http://example/message";

        try {
            final String message = this.restTemplate.getForObject(serviceUrl, String.class);
            return String.format("Message from ExampleApplication: \n %s \n", message);

        } catch (RestClientException e) {
            // Should fall to handleFallback method
            System.out.println("Error occurred - 'example' service unreachable");
        }

        return null;
    }

    /**
     * Used by Hystrix circuit breaker when 'example' service unavailable
     *
     * @return message
     */
    public String handleFallback() {
        return "Fallback method handled exception";
    }

}
