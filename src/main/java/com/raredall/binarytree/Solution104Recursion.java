package com.raredall.binarytree;

/**
 * 104. 二叉树的最大深度
 *
 * @author Raredall
 */
public class Solution104Recursion {

    public int maxDepth(TreeNode root) {
        return getDepth(root);
    }

    private int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = getDepth(node.left);
        int rightDepth = getDepth(node.right);
        return Math.max(leftDepth, rightDepth) + 1;
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
