package com.leetcode.stringreversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringReverserTest {
    @Test
    void itShouldReverseAGivenString() {
        var stringReverser = new StringReverser();
        var actual = stringReverser.reverse("Nasdaq");
        var expected = "qadsaN";

        assertEquals(expected, actual);
    }

    @Test
    void itShouldDoNothingWhenStringIsNull() {
        var stringReverser = new StringReverser();
        var actual = stringReverser.reverse(null);

        assertNull(actual);
    }

    @Test
    void itShouldDoNothingWhenStringIsEmpty() {
        var stringReverser = new StringReverser();
        var actual = stringReverser.reverse("  ");

        assertEquals("  ",actual);
    }
}
