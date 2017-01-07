package jp.bikon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
// Alternatively, use  @EnableZuulServer
// Using the @EnableZuulServer annotation you must explicitly configure proxying
// behavior to other applications. By using the @EnableZuulProxy annotation you
// are getting the benefit of automated discovery of Zuul filters through Eureka
// See http://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html#_plain_embedded_zuul
@EnableZuulProxy
@EnableDiscoveryClient// Alt. @EnableEurekaClient.
public class APIGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(APIGatewayApplication.class, args);
    }
}
