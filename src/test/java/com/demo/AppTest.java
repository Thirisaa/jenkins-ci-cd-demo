package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testMessage() {
        assertEquals("Hello from Jenkins CI/CD!", App.getMessage());
    }
}