package com.rvfs.javachallenges.leetcode.amazon.arraysandstrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/508/
 */
public class Question508Test {

    @ParameterizedTest
    @MethodSource
    void solution(int[] nums, int target, int[] expected) {
        int[] result = new Question508().twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    private static Stream<Arguments> solution() {
        List<Arguments> arguments = new ArrayList<>();

        arguments.add(Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}));
        arguments.add(Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}));
        arguments.add(Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}));

        return arguments.stream();
    }
}
