package jp.bikon.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Copyright (c) 2016 Jase Batchelor. All rights reserved.
 *
 * @author jase
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("zone-jp")
public class ExamplePropertiesProfileZoneJPTest {

    @Autowired
    private ExampleProperties config;

    @Value("${example.message}")
    private String message;

    @Test
    public void testProperties() {
        System.out.println("example.message = " + message);
        assertThat(config.getMessage(), equalTo("Message from local application.yml - zone-jp"));
    }
}
