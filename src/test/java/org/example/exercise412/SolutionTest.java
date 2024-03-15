package org.example.exercise412;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void returnsFizzIfInputDivisibleBy3() {
        Solution solution = new Solution();

        List<String> expectedResult = List.of("1", "2", "Fizz");
        assertThat(solution.fizzBuzz(3)).isEqualTo(expectedResult);
    }

    @Test
    void returnsBuzzIfInputDivisibleBy5() {
        Solution solution = new Solution();

        List<String> expectedResult = List.of("1", "2", "Fizz", "4", "Buzz");
        assertThat(solution.fizzBuzz(5)).isEqualTo(expectedResult);
    }

    @Test
    void returnsFizzBuzzIfInputDivisibleBy3And5() {
        Solution solution = new Solution();

        List<String> expectedResult = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz");
        assertThat(solution.fizzBuzz(15)).isEqualTo(expectedResult);
    }
}