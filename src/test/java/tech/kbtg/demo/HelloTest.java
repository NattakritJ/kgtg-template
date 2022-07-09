package tech.kbtg.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    void helloShouldBeSayHello() {
        Hello hello = new Hello();
        assertEquals("Hello.", hello.say());
    }
}
