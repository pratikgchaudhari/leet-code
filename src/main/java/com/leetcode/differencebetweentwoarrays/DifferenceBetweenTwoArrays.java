package com.leetcode.differencebetweentwoarrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * See LeetCode Problem:
 * <a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/description/">
 *  Find the Difference of Two Arrays
 *  </a>
 */

public class DifferenceBetweenTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        var result = new ArrayList<List<Integer>>();

        result.add(missingElement(nums2, nums1));
        result.add(missingElement(nums1, nums2));

        return result;
    }

    private List<Integer> missingElement(int[] source, int[] target) {
        var set = new HashSet<Integer>();

        var missingElements = new HashSet<Integer>();

        for (var num : source) {
            set.add(num);
        }

        for (var num : target) {
            if (!set.contains(num)) {
                missingElements.add(num);
            }
        }

        return missingElements.stream().toList();
    }
}
