package com.chern.leetcode.binarytree.traversal;

import java.util.*;

public class Solution {

    public static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root);
        TreeNode current;
        while (!nodeStack.isEmpty()) {
            current = nodeStack.pop();

            resultList.add(current.getVal());

            if (current.getRight() != null) {
                nodeStack.push(current.getRight());
            }
            if (current.getLeft() != null) {
                nodeStack.push(current.getLeft());
            }
        }
        return resultList;
    }

    public static List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode current = root;
        while (!nodeStack.isEmpty() || current != null) {
            while (current != null) {
                nodeStack.push(current);
                current = current.getLeft();
            }

            current = nodeStack.pop();
            resultList.add(current.getVal());
            current = current.getRight();
        }
        return resultList;
    }

    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode current;
        nodeStack.push(root);
        while (!nodeStack.isEmpty()) {
            current = nodeStack.pop();
            resultList.add(0, current.getVal());

            if (current.getLeft() != null) {
                nodeStack.push(current.getLeft());
            }

            if (current.getRight() != null) {
                nodeStack.push(current.getRight());
            }
        }
        return resultList;
    }

    public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = nodeQueue.remove();
                levelList.add(current.getVal());
                if (current.getLeft() != null) {
                    nodeQueue.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    nodeQueue.add(current.getRight());
                }
            }
            result.add(levelList);
        }
        return result;
    }
}
