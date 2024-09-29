package com.rvfs.javachallenges.leetcode.amazon.arraysandstrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/508/
 */
public class Question2962Test {

    @ParameterizedTest
    @MethodSource
    void solution(String s, int expected) {
        int result = new Question2962().myAtoi(s);
        assertEquals(expected, result);
    }

    /*@ParameterizedTest
    @MethodSource("solution")
    void leetCodeSolution(int[] nums, int target, int[] expected) {
        int[] result = new Question508().solution(nums, target);
        assertArrayEquals(expected, result);
    }*/

    private static Stream<Arguments> solution() {
        List<Arguments> arguments = new ArrayList<>();

        arguments.add(Arguments.of("42", 42));
        arguments.add(Arguments.of("   -42", -42));
        arguments.add(Arguments.of("4193 with words", 4193));
        arguments.add(Arguments.of("words and 987", 0));
        arguments.add(Arguments.of("-91283472332", -2147483648));
        arguments.add(Arguments.of("+-12", 0));

        return arguments.stream();
    }
}
