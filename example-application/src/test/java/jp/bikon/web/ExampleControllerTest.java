package jp.bikon.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import jp.bikon.domain.Example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Copyright (c) 2017 Jase Batchelor. All rights reserved.
 *
 * @author jase
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ExampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void testCRUD() throws Exception {

        final Example example = new Example();
        example.setMessage("Test message");

        final String json = mapper.writeValueAsString(example);

        // Create
        mockMvc.perform(post("/message").contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.message", is("Example returned from create method")));

        // Read
        mockMvc.perform(get("/message/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.message", is("Example returned from getById method")));

        // Update
        mockMvc.perform(put("/message/1").contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.message", is("Example returned from update method")));

        // Delete
        mockMvc.perform(delete("/message/1")).andExpect(status().isOk());
    }

}
