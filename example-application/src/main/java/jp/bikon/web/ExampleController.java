package jp.bikon.web;

import jp.bikon.config.properties.ExampleProperties;
import jp.bikon.domain.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Copyright (c) 2016 Jase Batchelor. All rights reserved.
 *
 * @author jase
 */
@RequestMapping(value = "/message")
@RestController()
@EnableConfigurationProperties(ExampleProperties.class)
public class ExampleController {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleController.class);

    private final ExampleProperties config;

    @Autowired
    public ExampleController(ExampleProperties config) {
        this.config = config;
    }

    // CRUD methods ============================================================

    @GetMapping()
    public final Example get() {

        LOG.info("GET request received");

        final Example example = new Example();
        example.setMessage(config.getMessage());
        return example;
    }

    @GetMapping("/{id}")
    public Example getById(@PathVariable("id") final String id) {

        LOG.info("GET request received (getById)");

        final Example example = new Example();
        example.setMessage("Example returned from getById method");
        return example;
    }

    @PostMapping()
    public Example create(@Valid @RequestBody final Example example) {

        LOG.info("POST request received");

        example.setMessage("Example returned from create method");
        return example;
    }

    @PutMapping("/{id}")
    public Example update(@PathVariable("id") final String id, @Valid @RequestBody final Example example) {

        LOG.info("PUT request received");

        example.setMessage("Example returned from update method");
        return example;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final String id) {

        LOG.info("DELETE request received");
    }

}
