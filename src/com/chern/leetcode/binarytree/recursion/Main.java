package com.chern.leetcode.binarytree.recursion;

import com.chern.leetcode.binarytree.traversal.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.setLeft(null);
        root.setRight(new TreeNode(2, null, new TreeNode(3)));
        Solution.maxDepth(root, 0);
        System.out.println("Max depth = " + Solution.maxDepth);
    }
}
