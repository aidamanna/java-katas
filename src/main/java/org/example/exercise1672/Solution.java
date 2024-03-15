package org.example.exercise1672;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public int maximumWealth(int[][] accounts) {
//        SOLUTION 1
//        return accounts.stream()
//                .map(account -> account.stream().mapToInt(Integer::intValue).sum())
//                .max(Integer::compare)
//                .orElseThrow();

        int maximumWealth = 0;

        for (int[] account: accounts) {
            int wealth = 0;
            for (int bank: account) {
                wealth += bank;
            }

            maximumWealth = Math.max(wealth, maximumWealth);
        }

        return maximumWealth;
    }
}
