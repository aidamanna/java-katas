package org.example.exercise383;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getNotes")
    void returnsIfRansomNoteCanBeConstructedFromMagazine(
            String ransomNote, String magazine, Boolean expectedResult
    ) {
        Solution solution = new Solution();

        assertThat(solution.canConstruct(ransomNote, magazine)).isEqualTo(expectedResult);
    }

    static Stream<Arguments> getNotes() {
        return Stream.of(
                Arguments.of("a", "b", false),
                Arguments.of("aa", "ab", false),
                Arguments.of("aa", "aab", true)
        );
    }
}