package org.example.exercise1342;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

    @ParameterizedTest
    @MethodSource("getSteps")
    void returnsNumberOfStepsToReduceToZero(int input, int expectedOutput) {
        Solution solution = new Solution();

        assertThat(solution.numberOfSteps(input)).isEqualTo(expectedOutput);
    }

    static Stream<Arguments> getSteps() {
        return Stream.of(
                Arguments.of(14, 6),
                Arguments.of(8, 4),
                Arguments.of(0, 0)
        );
    }
}