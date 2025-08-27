package com.example.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Tests for {@link HelloWorldController}.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Verifies that the root endpoint returns Hello World.
     *
     * @throws Exception when the request fails
     */
    @Test
    public void helloEndpointReturnsHelloWorld() throws Exception {
        mockMvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello World!"));
    }
}
