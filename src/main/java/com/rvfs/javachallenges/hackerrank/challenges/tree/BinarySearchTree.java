package com.rvfs.javachallenges.hackerrank.challenges.tree;

public class BinarySearchTree {
    Node root;
    int height;

    public BinarySearchTree() {
        this.root = null;
    }

    public void add(int data) {
        this.root = addToNode(this.root, data);
    }

    private Node addToNode(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = addToNode(root.left, data);
        } else {
            root.right = addToNode(root.right, data);
        }
        return root;
    }

    // Compute height of the tree
    public int getHeight() {
        return computeHeight(root);
    }

    private int computeHeight(Node root) {
        if (root == null) {
            return -1; // Height of an empty tree is -1, single node tree is 0
        }
        return 1 + Math.max(computeHeight(root.left), computeHeight(root.right));
    }
}