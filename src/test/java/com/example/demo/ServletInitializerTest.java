package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;

import static org.assertj.core.api.Assertions.assertThat;

class ServletInitializerTest {

    private ServletInitializer servletInitializerUnderTest;

    @BeforeEach
    void setUp() {
        servletInitializerUnderTest = new ServletInitializer();
    }

    @Test
    void testConfigure() {
        // Setup
        final SpringApplicationBuilder application = new SpringApplicationBuilder(Object.class);

        // Run the test
        final SpringApplicationBuilder result = servletInitializerUnderTest.configure(application);

        // Verify the results
    }

    @Test
    void testHehhe() {
        assertThat(servletInitializerUnderTest.hehhe()).isTrue();
    }
}
