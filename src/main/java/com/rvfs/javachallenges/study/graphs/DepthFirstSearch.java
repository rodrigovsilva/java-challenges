package com.rvfs.javachallenges.study.graphs;

import java.util.Map;

public class DepthFirstSearch {

    public String solution(Map<String, String[]> graph, String startNode) {
        StringBuilder result = new StringBuilder();
        dfs(graph, startNode, result);

        char[][] matrix = new char[3][3];
        int i = matrix.length;
        int j = matrix[0].length;
        return result.toString();
    }

    private static void dfs(Map<String, String[]> graph, String node, StringBuilder result) {
        result.append(node);

        for (String neighbor : graph.get(node)) {
            dfs(graph, neighbor, result);
        }
    }
}
