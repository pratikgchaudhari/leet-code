package com.leetcode.missingnumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MissingNumberFinderTest {
    @Test
    void shouldFindTheMissingNumberGivenAnArrayOfNumbers() {
        var missingNumberFinder = new MissingNumberFinder();

        var missingNumber = missingNumberFinder.find(new int[] { 3, 0, 1 });

        assertEquals(2, missingNumber);

    }

    @Test
    void shouldReturnZeroWhenThereIsNoMissingNumberGivenAnArrayOfNumbers1() {
        var missingNumberFinder = new MissingNumberFinder();

        var missingNumber = missingNumberFinder.find(new int[] { 2, 3, 1 });

        assertEquals(0, missingNumber);

    }
}
