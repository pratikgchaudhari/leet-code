package com.leetcode.countingelements;

import java.io.IOException;
import java.util.ArrayList;

public class CountingElements {

    public static void main(String[] args) throws IOException {

        var input = new int[]{1,2,3};

        System.out.println(countElements(input));
    }

    public static int countElements(int[] arr) {

        var elements = 0;

        var numList = new ArrayList<Integer>();

        for(var i: arr) {
            numList.add(i);
        }

        for(var num: numList) {
            if(numList.contains(num + 1)) {
                elements++;
            }
        }

        return elements;

    }
}