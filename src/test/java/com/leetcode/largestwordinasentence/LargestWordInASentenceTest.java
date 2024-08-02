package com.leetcode.largestwordinasentence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LargestWordInASentenceTest {
    @Test
    void shouldReturnTheLargestWordInAGivenSentence() {
        var largestWordInAGivenSentence = new LargestWordInASentence(
                "This is a sentence containing some small & some large words.");
        assertEquals("containing", largestWordInAGivenSentence.largestWord());
    }

    @Test
    void shouldReturnNullWhenTheSentenceIsNull() {
        var largestWordInAGivenSentence = new LargestWordInASentence(
                null);
        assertEquals(null, largestWordInAGivenSentence.largestWord());
    }

    @Test
    void shouldReturnNullWhenTheSentenceIsEmpty() {
        var largestWordInAGivenSentence = new LargestWordInASentence(
                "   ");
        assertEquals(null, largestWordInAGivenSentence.largestWord());
    }
}
