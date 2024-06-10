package com.leetcode.firstuniquenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueNumberTest {

    @Test
    void shouldReturnTheFirstUniqNumberInGivenSeries() {
        FirstUniqueNumber firstUniqueNumber = new FirstUniqueNumber(new int[]{7, 7, 7, 7, 7, 7});
        assertEquals(-1, firstUniqueNumber.showFirstUnique());
        firstUniqueNumber.add(5);
        assertEquals(5, firstUniqueNumber.showFirstUnique());
        firstUniqueNumber.add(5);
        assertEquals(-1, firstUniqueNumber.showFirstUnique());
        firstUniqueNumber.add(2);
        assertEquals(2, firstUniqueNumber.showFirstUnique());
    }

}