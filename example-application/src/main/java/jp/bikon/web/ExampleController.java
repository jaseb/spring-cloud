package jp.bikon.web;

import jp.bikon.config.ExampleProperties;
import jp.bikon.domain.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2016 Jase Batchelor. All rights reserved.
 *
 * @author jase
 */
@RestController
@EnableConfigurationProperties(ExampleProperties.class)
public class ExampleController {

    @Autowired
    private ExampleProperties config;

    @RequestMapping("/message")
    public final Example getMessage() {

        final Example example = new Example();
        example.setText(config.getMessage());
        return example;
    }
}
