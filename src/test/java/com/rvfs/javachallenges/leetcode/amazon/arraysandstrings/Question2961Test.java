package com.rvfs.javachallenges.leetcode.amazon.arraysandstrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/2961/
 */
public class Question2961Test {

    @ParameterizedTest
    @MethodSource
    void solution(String s, int expected) {
        int result = new Question2961().lengthOfLongestSubstring(s);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> solution() {
        List<Arguments> arguments = new ArrayList<>();

        arguments.add(Arguments.of("abcabcbb", 3));
        arguments.add(Arguments.of("bbbbb", 1));
        arguments.add(Arguments.of("pwwkew", 3));
        arguments.add(Arguments.of("", 0));
        arguments.add(Arguments.of("au", 2));
        arguments.add(Arguments.of(" ", 1));
        arguments.add(Arguments.of("dvdf", 3));

        return arguments.stream();
    }
}
