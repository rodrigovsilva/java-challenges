package com.rvfs.javachallenges.hackerrank.challenges.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
public class SherlockAndValidString {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
        Map<Character, Integer> count = new HashMap<>();

        for (char letter : s.toCharArray()) {
            int frequency = count.getOrDefault(letter, 0) + 1;
            count.put(letter, frequency);
        }

        Map<Integer, Integer> countDistinctValues = new HashMap<>();

        for (int value : count.values()) {
            countDistinctValues.put(value, countDistinctValues.getOrDefault(value, 0) + 1);
        }

        if (countDistinctValues.size() == 1) {
            return "YES";
        }

        if(countDistinctValues.size() == 2) {
            int minFrequency = countDistinctValues.values().stream().min(Integer::compareTo).get();
            //int maxFrequency = countDistinctValues.values().stream().min(Integer::compareTo).get();

            if (minFrequency == 1 && countDistinctValues.get(minFrequency) == 1) {
                return "YES";
            }
        }

        return "NO";
    }

}
