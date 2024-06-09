package com.leetcode.countingelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingElementsTest {

    @Test
    void shouldReturnTheNumberOfElementsInAGivenArrayThatLeadToOtherExistingElementAfterAddingOne() {
        CountingElements countingElements = new CountingElements();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};

        var result = countingElements.countElements(input);
        assertEquals(6, result);
    }

    @Test
    void shouldCountDuplicateElementsInAGivenArrayThatLeadToOtherExistingElementAfterAddingOne() {
        CountingElements countingElements = new CountingElements();
        int[] input = new int[]{1, 2, 3, 2, 3};

        var result = countingElements.countElements(input);
        assertEquals(3, result);
    }

    @Test
    void shouldReturnZeroWhenAddingOneToAnElementDoesNotLeadToOtherExistingElements() {
        CountingElements countingElements = new CountingElements();
        int[] input = new int[]{1, 3, 5, 7};

        var result = countingElements.countElements(input);
        assertEquals(0, result);
    }

}