package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Spring Boot application.
 */
@SpringBootApplication
public class HelloWorldApplication {

    /**
     * Starts the application.
     *
     * @param args standard program arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
