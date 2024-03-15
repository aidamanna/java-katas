package org.example.exercise1342;

public class Solution {
    public int numberOfSteps(int input) {
        int numberOfSteps = 0;

        while (input != 0) {
            numberOfSteps++;

            if (input % 2 == 0) {
                input /= 2;
            } else {
                input--;
            }
        }

        return numberOfSteps;
    }
}
