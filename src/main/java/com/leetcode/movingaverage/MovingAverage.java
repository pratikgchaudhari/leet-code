package com.leetcode.movingaverage;

import java.util.ArrayList;
import java.util.List;

public class MovingAverage {
    private int capacity = 0;
    private List<Integer> elements = null;
    private int pointer = -1;

    public MovingAverage(int size) {
        capacity = size;
        elements = new ArrayList<>(3);
    }

    public double next(int val) {
        var sum = 0;

        if (pointer < capacity - 1) {
            pointer += 1;
        } else {
            pointer = 0;
        }

        if (elements.size() == capacity) {
            elements.set(pointer, val);
        } else {
            elements.add(pointer, val);
        }

        for (var element : elements) {
            sum += element;
        }

        return ((double) sum / elements.size());
    }
}
