package jp.bikon.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;

/**
 * Copyright (c) 2016 Jase Batchelor. All rights reserved.
 *
 * See: http://docs.spring.io/spring-boot/docs/current/
 *   - 24.7 Type-safe Configuration Properties
 *
 * @author jase
 */
@ConfigurationProperties(prefix = "example")
public final class ExampleProperties {

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
