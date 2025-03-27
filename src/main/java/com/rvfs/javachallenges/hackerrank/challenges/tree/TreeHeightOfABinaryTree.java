package com.rvfs.javachallenges.hackerrank.challenges.tree;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=trees
 */
public class TreeHeightOfABinaryTree {

    public static int getHeight(int numNodes, int[] nodeData) {
        // convert to int array
        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0; i < numNodes; i++) {
            bst.add(nodeData[i]);
        }

        return bst.getHeight();
    }
}
