package com.chern.leetcode.binarytree.recursion;

import com.chern.leetcode.binarytree.traversal.TreeNode;

public class Solution {

    public static int maxDepth = 0;

    public static void maxDepth(TreeNode root, int depth){
        if (root == null){
            return;
        }

        TreeNode left = root.getLeft();
        TreeNode right = root.getRight();

        if (root.getLeft() == null && root.getRight() == null){
            maxDepth = Math.max(maxDepth, depth);
        }

        maxDepth(left, depth + 1);
        maxDepth(right, depth + 1);

    }

    public static boolean isSymmetric(TreeNode root){
        return check(root.getLeft(), root.getRight());
    }

    private static boolean check(TreeNode left, TreeNode right){

        if (left == null || right == null){
            return left == right;
        }
        return left.getVal() == right.getVal()
                && check(left.getLeft(), right.getRight())
                && check(left.getRight(), right.getLeft());
    }
}
