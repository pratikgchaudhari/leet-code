package com.leetcode.noofcharactersinstring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NoOfCharactersInStringTest {

    @Test
    void shouldReturnTheNoOfCharactersInAGivenString() {
        var noOfCharactersInString = new NoOfCharactersInString("This");
        assertEquals(4, noOfCharactersInString.count());
    }

    @Test
    void shouldReturnZeroWhenTheStringIsNull() {
        var noOfCharactersInString = new NoOfCharactersInString(null);
        assertEquals(0, noOfCharactersInString.count());
    }

    @Test
    void shouldReturnZeroWhenTheStringIsEmpty() {
        var noOfCharactersInString = new NoOfCharactersInString(" ");
        assertEquals(0, noOfCharactersInString.count());
    }
}
