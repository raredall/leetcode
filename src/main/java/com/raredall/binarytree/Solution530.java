package com.raredall.binarytree;

/**
 * 530. 二叉搜索树的最小绝对差
 *
 * @author Raredall
 */
public class Solution530 {

    private TreeNode pre;

    private int minDiff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }

    private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        if (pre != null) {
            minDiff = Math.min(minDiff, node.val - pre.val);
        }
        pre = node;
        inOrder(node.right);
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
