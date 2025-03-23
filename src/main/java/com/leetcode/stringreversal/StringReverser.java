package com.leetcode.stringreversal;

public class StringReverser {

    public String reverse(String s) {

        if (s == null || s.isBlank())
            return s;

        var characters = s.toCharArray();
        int left = 0, right = characters.length - 1;

        while (left < right){
            var temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }
}
