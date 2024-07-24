package com.leetcode.mostrepeatedcharacter;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedCharacterFinder {

    private final String input;

    public MostRepeatedCharacterFinder(String input) {
        this.input = input;
    }

    public Character find() {
        return this.input.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}
