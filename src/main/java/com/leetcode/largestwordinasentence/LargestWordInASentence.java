package com.leetcode.largestwordinasentence;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargestWordInASentence {
    private final String sentence;

    LargestWordInASentence(String sentence) {
        this.sentence = sentence;
    }

    public String largestWord() {

        if (sentence == null || sentence.isBlank()) {
            return null;
        }

        return Stream
                .of(sentence.split(" "))
                .collect(Collectors.maxBy(Comparator.comparing(String::length)))
                .orElse(null);
    }
}
