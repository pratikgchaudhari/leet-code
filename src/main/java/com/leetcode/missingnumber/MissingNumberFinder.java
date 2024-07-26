package com.leetcode.missingnumber;

import java.util.Arrays;

public class MissingNumberFinder {
    public int find(int[] numbers) {
        var n = numbers.length;

        var expectedSum = n * (n + 1) / 2;

        var actualSum = Arrays.stream(numbers)
                .sum();

        return expectedSum - actualSum;
    }
}
