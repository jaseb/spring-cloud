package jp.bikon.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Copyright (c) 2016 Jase Batchelor. All rights reserved.
 *
 * @author jase
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ExampleController.class)
@ActiveProfiles("test")
public class ExampleControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testMessageEndpointGet() throws Exception {

        mvc.perform(get("/message").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.text", is("Message from local application.yml - test")))
                .andReturn();
    }

}
