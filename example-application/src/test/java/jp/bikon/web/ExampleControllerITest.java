package jp.bikon.web;

import jp.bikon.domain.Example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.junit.Assert.*;

/**
 * Copyright (c) 2017 Jase Batchelor. All rights reserved.
 *
 * @author jase
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ExampleControllerITest {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/message/");
    }

    @Test
    public void testCRUD() throws Exception {

        final Example example = new Example();
        example.setMessage("Test message");

        // Create (POST)
        ResponseEntity<Example> response =
                template.postForEntity(base.toString(), example, Example.class);
        assertNotNull("Should not be null", response.getBody());
        assertEquals("Example returned from create method", response.getBody().getMessage());

        // Read (GET)
        response = template.getForEntity(base.toString() + "1", Example.class);
        assertNotNull("Should not be null", response.getBody());
        assertEquals("Example returned from getById method", response.getBody().getMessage());

        // Update (PUT)
        // Returns void - use template.exchange(...)
        //template.put(base.toString() + "1", example, Example.class);
        response = template.exchange(base.toString() + "1", HttpMethod.PUT, new HttpEntity<>(example), Example.class, 1L);
        assertNotNull("Should not be null", response.getBody());
        assertEquals("Example returned from update method", response.getBody().getMessage());

        // Delete (DELETE)
        // Returns void - use template.exchange(...)
        //template.delete(base.toString() + "1");
        response = template.exchange(base.toString() + "1", HttpMethod.DELETE, new HttpEntity<>("1"), Example.class);
        assertNull("Should not be null", response.getBody());
        assertEquals(200, response.getStatusCodeValue());
    }
}
