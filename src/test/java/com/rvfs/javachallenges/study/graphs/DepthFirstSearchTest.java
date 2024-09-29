package com.rvfs.javachallenges.study.graphs;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DepthFirstSearchTest {

    @ParameterizedTest
    @MethodSource
    public void testSolution(String expected, Map<String, String[]> graph, String startNode) {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        String result = depthFirstSearch.solution(graph, startNode);
        assertEquals(expected, result);
    }

    static Stream<Arguments> testSolution() {
        return Stream.of(
                Arguments.of("abdfce", Map.of(
                        "a", new String[]{"b", "c"},
                        "b", new String[]{"d"},
                        "c", new String[]{"e"},
                        "d", new String[]{"f"},
                        "e", new String[]{},
                        "f", new String[]{}
                ),"a")
        );
    }
}
