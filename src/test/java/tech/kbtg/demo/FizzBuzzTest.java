package tech.kbtg.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzzShouldBeSayNumber() {
        String actual = FizzBuzz.handle(2);

        assertEquals("1 2", actual);
    }

    @Test
    void fizzBuzzShouldBeSayNumberAndFizz() {
        String actual = FizzBuzz.handle(3);

        assertEquals("1 2 Fizz", actual);
    }

    @Test
    void fizzBuzzShouldBeSayNumberAndFizzAndBuzz() {
        String actual = FizzBuzz.handle(5);

        assertEquals("1 2 Fizz 4 Buzz", actual);
    }

    @Test
    void fizzBuzzShouldBeFizzBuzz() {
        String actual = FizzBuzz.handle(15);

        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz", actual);
    }
}
