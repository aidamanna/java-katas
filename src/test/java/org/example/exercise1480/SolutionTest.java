package org.example.exercise1480;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void returnsRunningSumOf1DArray() {
        int[] input = {3,1,2,10,1};

        var solution = new Solution();

        int[] expectedOutput = {3,4,6,16,17};
        assertThat(solution.runningSum(input)).isEqualTo(expectedOutput);
    }
}