package com.raredall.binarytree;

/**
 * 111. 二叉树的最小深度
 *
 * @author Raredall
 */
public class Solution111Recursion {

    public int minDepth(TreeNode root) {
        return getDepth(root);
    }

    private int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = minDepth(node.left);
        int rightDepth = minDepth(node.right);
        if (leftDepth == 0) {
            return rightDepth + 1;
        }
        if (rightDepth == 0) {
            return leftDepth + 1;
        }
        return Math.min(leftDepth, rightDepth) + 1;
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
