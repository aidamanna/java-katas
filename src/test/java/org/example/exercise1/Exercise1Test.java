package org.example.exercise1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class Exercise1Test {
    @Test
    void shouldReturnHelloWorld() {
        var exercise1 = new Exercise1();

        assertThat(exercise1.execute()).isEqualTo("Hello World");
    }
}