package tech.kbtg.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzzShouldBeSayNumber() {
        int[] input = {1,2};
        String actual = FizzBuzz.handle(input);

        assertEquals("1 2", actual);
    }

    @Test
    void fizzBuzzShouldBeSayNumberAndFizz() {
        int[] input = {1,2,3};
        String actual = FizzBuzz.handle(input);

        assertEquals("1 2 Fizz", actual);
    }

    @Test
    void fizzBuzzShouldBeSayNumberAndFizzAndBuzz() {
        int[] input = {1,2,3,4,5};
        String actual = FizzBuzz.handle(input);

        assertEquals("1 2 Fizz 4 Buzz", actual);
    }

    @Test
    void fizzBuzzShouldBeFizzBuzz() {
        int[] input = {14, 15};
        String actual = FizzBuzz.handle(input);

        assertEquals("14 FizzBuzz", actual);
    }
}
