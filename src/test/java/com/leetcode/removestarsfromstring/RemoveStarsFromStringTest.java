package com.leetcode.removestarsfromstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveStarsFromStringTest {

    @Test
    void itShouldRemoveStarAlongWithThePrecedingCharacter() {
        var removeStarsFromString = new RemoveStarsFromString();
        var actual = removeStarsFromString.removeStars("leet**cod*e");
        var expected = "lecoe";

        assertEquals(expected, actual);
    }

    @Test
    void itShouldKeepTheStringIntactWhenThereAreNoStartCharacters() {
        var removeStarsFromString = new RemoveStarsFromString();
        var actual = removeStarsFromString.removeStars("leetcode");
        var expected = "leetcode";

        assertEquals(expected, actual);
    }
}
