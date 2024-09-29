package com.rvfs.javachallenges.hackerrank.challenges.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
public class CtciMakingAnagrams {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public int makeAnagram(String a, String b) {
        Map<Character, Integer> count = new HashMap<>();

        for (char letter : a.toCharArray()) {
            count.put(letter, count.getOrDefault(letter, 0) + 1);
        }

        for (char letter : b.toCharArray()) {
            count.put(letter, count.getOrDefault(letter, 0) - 1);
        }

        int deletions = 0;

        for (int value : count.values()) {
            deletions += Math.abs(value);
        }

        return deletions;
    }
}
