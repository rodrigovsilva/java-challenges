package com.rvfs.javachallenges.leetcode.amazon.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/2961/
 */
public class Question2961 {
    public int lengthOfLongestSubstring(String s) {
        Map<String, Integer> position = new HashMap<>();
        int max = 0;
        int temp = 0;

        if (s.isEmpty()) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        for (int i = 0; i < s.length(); ) {
            String c = s.substring(i, i + 1);
            if (position.containsKey(c)) {// add count
                i = position.get(c) + 1;
                temp = 0;
                position.clear();
            }

            position.put(s.substring(i, i + 1), i);
            temp++;
            i++;

            max = Math.max(temp, max);
        }

        return max;
    }
}
