package com.leetcode.noofcharactersinstring;

import java.util.stream.Stream;

public class NoOfCharactersInString {
    private final String s;

    public NoOfCharactersInString(String s) {
        this.s = s;
    }

    public long count() {
        if (s == null || s.isBlank())
            return 0;
        return Stream
                .of(s.split(""))
                .count();
    }

}
