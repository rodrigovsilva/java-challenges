package com.rvfs.javachallenges.hackerrank.challenges.graphs;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NumIslandsTest {

    @ParameterizedTest
    @MethodSource
    public void testSolution(int expected, char[][] graph) {
        NumIslands test = new NumIslands();
        int result = test.solution(graph);
        assertEquals(expected, result);
    }

    static Stream<Arguments> testSolution() {
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        return Stream.of(
                Arguments.of(1, grid1)
        );
    }
}
