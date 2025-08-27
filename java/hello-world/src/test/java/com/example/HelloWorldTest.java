package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class HelloWorldTest {
    @Test
    void printsHelloWorld() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        HelloWorld.main(new String[0]);

        System.setOut(originalOut);
        assertEquals("Hello World!\n", out.toString());
    }
}
