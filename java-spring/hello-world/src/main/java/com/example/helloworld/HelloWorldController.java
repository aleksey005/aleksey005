package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller that returns a friendly greeting.
 */
@RestController
public class HelloWorldController {

    /**
     * Returns Hello World greeting.
     *
     * @return greeting string
     */
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
}
