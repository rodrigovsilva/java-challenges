package com.rvfs.javachallenges.study.graphs;

import java.util.Map;
import java.util.Queue;

public class BreadthFirstSearch {

    public String solution(Map<String, String[]> graph, String startNode) {
        StringBuilder result = new StringBuilder();
        Queue<String> queue = new java.util.LinkedList<>();
        queue.add(startNode);

        while (!queue.isEmpty()) {
            String node = queue.poll();
            result.append(node);

            for (String neighbor : graph.get(node)) {
                queue.add(neighbor);
            }
        }

        return result.toString();
    }

}
