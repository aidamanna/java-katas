package org.example.exercise1672;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void returnsTheRichestCustomerWealth() {
        Solution solution = new Solution();
        int[][] accounts = {{7,1,3}, {2,8,7}, {1,9,5}};

//        List<List<Integer>> accounts = List.of(
//                List.of(7, 1, 3),
//                List.of(2, 8, 7),
//                List.of(1, 9, 5)
//        );

        assertThat(solution.maximumWealth(accounts)).isEqualTo(17);

    }
}