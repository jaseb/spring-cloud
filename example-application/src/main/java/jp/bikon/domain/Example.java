package jp.bikon.domain;

import io.swagger.annotations.ApiModelProperty;

/**
 * Copyright (c) 2016 Jase Batchelor. All rights reserved.
 *
 * @author jase
 */
public final class Example {

    private String message;

    @ApiModelProperty(notes = "The message content", required = true)
    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
