package com.leetcode.removestarsfromstring;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * See LeetCode Problem:
 * <a href="https://leetcode.com/problems/removing-stars-from-a-string/description/">
 *  Removing Stars From a String
 *  </a>
 */
public class RemoveStarsFromString {

    public String removeStars(String s) {
        var characters = s.toCharArray();

        var temp = new ArrayList<Character>();

        for (char character : characters) {
            temp.add(character);
        }

        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) == '*') {
                temp.remove(i);
                temp.remove(i - 1);
                i = 0;
            }
        }

        return temp.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
