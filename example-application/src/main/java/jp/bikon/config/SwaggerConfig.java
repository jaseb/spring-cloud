package jp.bikon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Copyright (c) 2017 Jase Batchelor. All rights reserved.
 *
 * @author jase
 */
@Configuration
@EnableSwagger2
@ComponentScan("jp.bikon.web")
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("example")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("jp.bikon.web")) // All: RequestHandlerSelectors.any()
                .paths(PathSelectors.any()) // Filter: regex("/example.*")
                .build();
    }

    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title("Spring-Cloud Example - Swagger")
                .description("Example Swagger integration")
                .termsOfServiceUrl("TOS")
                .contact(new Contact("bīkon", "http://api.bikon.jp", "example@bikon.jp"))
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/jaseb/spring-cloud/blob/master/LICENSE")
                .version("1.0")
                .build();
    }
}
