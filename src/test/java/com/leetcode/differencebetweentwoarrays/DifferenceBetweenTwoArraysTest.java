package com.leetcode.differencebetweentwoarrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceBetweenTwoArraysTest {

    @Test
    @DisplayName("It should return the missing elements from both arrays")
    void itShouldReturnTheMissingElementsFromBothArrays() {
        var differenceBetweenTwoArrays = new DifferenceBetweenTwoArrays();
        var result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        result.get(0).add(2);
        result.get(1).add(5);
        result.get(1).add(6);
        assertEquals(result, differenceBetweenTwoArrays.findDifference(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 6}));

    }

    @Test
    @DisplayName("It should return the missing elements from both arrays while discarding duplicate elements (if any)")
    void itShouldReturnTheMissingElementsFromBothArraysWhileDiscardingDuplicateElementsIfAny() {
        var differenceBetweenTwoArrays = new DifferenceBetweenTwoArrays();
        var result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        result.get(0).add(2);
        result.get(1).add(3);
        result.get(1).add(5);
        result.get(1).add(6);
        assertEquals(result, differenceBetweenTwoArrays.findDifference(new int[]{1, 2, 2, 4}, new int[]{3, 4, 5, 6}));

    }
}
