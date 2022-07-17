package com.raredall.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 113. 路径总和 II
 *
 * @author Raredall
 */
public class Solution113 {

    private final List<List<Integer>> res = new ArrayList<>();
    private final Deque<Integer> path = new ArrayDeque<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        preorder(root, targetSum);
        return res;
    }

    private void preorder(TreeNode node, int targetSum) {
        if (node == null) {
            return;
        }

        path.offerLast(node.val);
        targetSum -= node.val;
        if (node.left == null && node.right == null && targetSum == 0) {
            res.add(new ArrayList<>(path));
        }
        preorder(node.left, targetSum);
        preorder(node.right, targetSum);
        path.pollLast();
    }

    private static class TreeNode {

        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

}
