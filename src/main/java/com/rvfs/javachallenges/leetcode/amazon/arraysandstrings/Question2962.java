package com.rvfs.javachallenges.leetcode.amazon.arraysandstrings;

/**
 * https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/2962/
 */
public class Question2962 {

    public int myAtoi(String s) {
        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        boolean isNegative = false;

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            isNegative = s.charAt(0) == '-';
            s = s.substring(1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                s = s.substring(0, i);
                break;
            }
        }

        int result = Integer.parseInt(s);

        return isNegative ? result * -1 : result;
    }
}
