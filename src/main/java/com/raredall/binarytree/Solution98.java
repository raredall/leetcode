package com.raredall.binarytree;

/**
 * 98. 验证二叉搜索树
 *
 * @author Raredall
 */
public class Solution98 {

    private TreeNode max;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean left = isValidBST(root.left);
        if (!left) {
            return false;
        }

        if (max != null && root.val <= max.val) {
            return false;
        }
        max = root;

        return isValidBST(root.right);
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
