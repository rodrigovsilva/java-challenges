package com.rvfs.javachallenges.leetcode.amazon.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/508/
 */
public class Question508 {
    /**
     * O(n^2) NumIslands
     * Brute Force
     *
     * @author Rodrigo
     */
    public int[] twoSum(int[] nums, int target) {
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                if (nums[a] + nums[b] == target) {
                    return new int[]{a, b};
                }
            }
        }
        return new int[]{};
    }

    /**
     * O(n) NumIslands
     *
     * @autor Leetcode.com
     */
    public int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
