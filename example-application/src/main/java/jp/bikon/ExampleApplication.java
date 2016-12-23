package jp.bikon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(
                type = FilterType.REGEX,
                pattern="jp.bikon.config.*.*Properties"
        )
})
@EnableDiscoveryClient
public class ExampleApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}
