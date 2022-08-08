package com.chern.leetcode.binarytree.traversal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.setLeft(null);
        root.setRight(new TreeNode(2, null, new TreeNode(3)));
        List<Integer> preOrderTraversal = Solution.preOrderTraversal(root);
        List<Integer> inOrderTraversal = Solution.inOrderTraversal(root);
        List<Integer> postOrderTraversal = Solution.postOrderTraversal(root);
        List<List<Integer>> levelOrderTraversal = Solution.levelOrderTraversal(root);
        System.out.println("Pre order = " + preOrderTraversal);
        System.out.println("In order = " + inOrderTraversal);
        System.out.println("Post order = " + postOrderTraversal);
        System.out.println("Level order = " + levelOrderTraversal);
    }

}
