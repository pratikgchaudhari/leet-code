package com.leetcode.countingelements;

import java.util.ArrayList;

public class CountingElements {

    public int countElements(int[] arr) {

        var elements = 0;

        var numList = new ArrayList<Integer>();

        for (var i : arr) {
            numList.add(i);
        }

        for (var num : numList) {
            if (numList.contains(num + 1)) {
                elements++;
            }
        }

        return elements;

    }
}