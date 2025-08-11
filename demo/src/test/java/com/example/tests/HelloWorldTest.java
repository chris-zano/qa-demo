package com.example.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    @Test
    void testHelloWorld() {
        String greeting = "Hello, World!";
        assertEquals("Hello, World!", greeting);
    }
}
