package com.rvfs.javachallenges.leetcode.amazon.interview;

import com.rvfs.javachallenges.leetcode.amazon.arraysandstrings.Question508;
import com.rvfs.javachallenges.leetcode.interview.NQueens;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NQueensTest {


    @ParameterizedTest
    @MethodSource
    void solution(int queens, List<List<String>> expected) {
        List<List<String>> actual = new NQueens().solveNQueens(queens);

        // Convert lists to sets to ignore order of solutions
        Set<List<String>> expectedSet = new HashSet<>(expected);
        Set<List<String>> actualSet = new HashSet<>(actual);

        assertEquals(expectedSet, actualSet); // Assert that the expected result matches the actual result
    }

    private static Stream<Arguments> solution() {
        List<Arguments> arguments = new ArrayList<>();

        // Test case 1: N = 4, expected solutions
        List<List<String>> expected1 = Arrays.asList(
                Arrays.asList(".Q..", "...Q", "Q...", "..Q."),
                Arrays.asList("..Q.", "Q...", "...Q", ".Q..")
        );
        arguments.add(Arguments.of(4, expected1));

        // Test case 2: N = 1, expected solution
        List<List<String>> expected2 = List.of(
                List.of("Q")
        );
        arguments.add(Arguments.of(1, expected2));

        // Test case 3: N = 2, expected solution (no solution exists, should return an empty list)
        arguments.add(Arguments.of(2, Collections.emptyList()));

        // Test case 4: N = 3, expected solution (no solution exists, should return an empty list)
        arguments.add(Arguments.of(3, Collections.emptyList()));

        return arguments.stream();
    }
}
