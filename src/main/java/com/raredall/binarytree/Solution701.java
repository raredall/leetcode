package com.raredall.binarytree;

/**
 * 701. 二叉搜索树中的插入操作
 *
 * @author Raredall
 */
public class Solution701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode cur = root;
        TreeNode pre = root;
        while (cur != null) {
            pre = cur;
            if (val < cur.val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        if (val < pre.val) {
            pre.left = new TreeNode(val);
        } else {
            pre.right = new TreeNode(val);
        }

        return root;
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
