package com.leetcode.mostrepeatedcharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MostRepeatedCharacterFinderTest {

    @Test
    void shouldFindMostRepeatedCharacter() {
        var mostRepeaterCharacterFinder = new MostRepeatedCharacterFinder("adsedrrrtdd");
        assertEquals(mostRepeaterCharacterFinder.find(), 'd');
    }

}