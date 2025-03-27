package com.rvfs.javachallenges.hackerrank.challenges.tree;

import com.rvfs.javachallenges.hackerrank.challenges.strings.CtciMakingAnagrams;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeHeightOfABinaryTreeTest {

    @ParameterizedTest
    @MethodSource
    void solution(int numNodes, int[] nodeData, int expected) {
        int result = TreeHeightOfABinaryTree.getHeight(numNodes, nodeData);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> solution() {
        List<Arguments> arguments = new ArrayList<>();

        arguments.add(Arguments.of(7, new int[]{3, 5, 2, 1, 4, 6, 7}, 3));
        arguments.add(Arguments.of(1, new int[]{15}, 0));
        arguments.add(Arguments.of(5, new int[]{3, 1, 7, 5, 4}, 3));

        return arguments.stream();
    }
}
