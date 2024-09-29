package com.rvfs.javachallenges.hackerrank.challenges.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class NumIslands {
    public int solution(char[][] grid) {
        int totalIslands = 0;

        int rows = grid.length;
        if (rows == 0) // Check if the grid is empty
            return 0;
        int cols = grid[0].length;

        Set<Node> visited = new HashSet<>();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1' && !visited.contains(new Node(r, c))) {
                    bfs(r, c, grid, rows, cols, visited);
                    totalIslands++;
                }
            }
        }

        return totalIslands;
    }

    private void bfs(int r, int c, char[][] grid, int totalRows, int totalCols, Set<Node> visited) {
        Queue<Node> queue = new LinkedList<>();
        var startingNode = new Node(r, c);
        queue.add(startingNode);
        visited.add(startingNode);

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int[] direction : directions) {
                int currR = node.r() + direction[0];
                int currC = node.c() + direction[1];
                var currNode = new Node(currR, currC);
                if (!visited.contains(currNode)) {
                    visited.add(currNode);
                    if (currR >= 0 && currR < totalRows && currC >= 0 && currC < totalCols && grid[currR][currC] == '1') {
                        queue.add(currNode);
                    }
                }
            }
        }
    }


    public record Node(int r, int c) {
    }
}