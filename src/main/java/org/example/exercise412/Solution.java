package org.example.exercise412;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzz = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            fizzBuzz.add(getStringRepresentation(i));
        }

        return fizzBuzz;


//        FUNCTIONAL SOLUTION
//        return IntStream
//                .range(1, n + 1)
//                .mapToObj(Solution::getStringRepresentation)
//                .toList();
    }

    private static String getStringRepresentation(int value) {
        String stringRepresentation = "";

        if (value % 3 == 0) {
            stringRepresentation += "Fizz";
        }

        if (value % 5 == 0) {
            stringRepresentation += "Buzz";
        }

        if (stringRepresentation.isEmpty()) {
            return String.valueOf(value);
        }

        return stringRepresentation;
    }
}
