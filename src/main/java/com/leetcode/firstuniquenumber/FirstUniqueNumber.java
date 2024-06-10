package com.leetcode.firstuniquenumber;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueNumber {
    private final Map<Integer, Integer> elements = new LinkedHashMap<>();

    public FirstUniqueNumber(int[] nums) {
        for (int num : nums) {
            add(num);
        }
    }

    public int showFirstUnique() {
        for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            if (entry.getValue() == 0) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public void add(int value) {
        if (elements.containsKey(value)) {
            elements.put(value, elements.get(value) + 1);
        } else {
            elements.put(value, 0);
        }
    }
}
