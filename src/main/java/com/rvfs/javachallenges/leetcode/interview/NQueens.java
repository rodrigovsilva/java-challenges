package com.rvfs.javachallenges.leetcode.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/n-queens/submissions/1588632114/">Problem</a>
 */
public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        // Initialize board with '.' -> O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> results = new ArrayList<>();
        findSolution(board, 0, results); // Start at column 0, pass results

        return results;
    }

    private void findSolution(char[][] board, int col, List<List<String>> results) {
        int limit = board.length;

        // If all queens are placed, store the solution
        if (col == limit) {
            results.add(convertBoard(board)); // Store a valid board
            return; // Stop recursion
        }

        // Try placing a queen in each row of this column
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';  // Place queen
                findSolution(board, col + 1, results); // Recur for the next column
                board[row][col] = '.';  // Backtrack (remove the queen)
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col) {
        int limit = board.length;

        // Check the row (to the left side)
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') {
                return false; // There's already a queen in the same row
            }
        }

        // Check left upper diagonal
        for (int i = 1; row - i >= 0 && col - i >= 0; i++) {
            if (board[row - i][col - i] == 'Q') {
                return false; // There's already a queen on the upper diagonal
            }
        }

        // Check left lower diagonal
        for (int i = 1; row + i < limit && col - i >= 0; i++) {
            if (board[row + i][col - i] == 'Q') {
                return false; // There's already a queen on the lower diagonal
            }
        }

        return true;
    }

    private List<String> convertBoard(char[][] board) {
        List<String> converted = new ArrayList<>();
        for (char[] row : board) {
            converted.add(new String(row));  // Convert char[] to String
        }

        return converted;
    }

}
