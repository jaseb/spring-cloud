package jp.bikon.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Copyright (c) 2016 Jase Batchelor. All rights reserved.
 * <p>
 * See: http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
 * - 24.7 Type-safe Configuration Properties
 *
 * @author jase
 */
@Component
@ConfigurationProperties(prefix = "example")
public class ExampleProperties {

    /**
     * Message text used in JSON response.
     */
    @NotNull
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
