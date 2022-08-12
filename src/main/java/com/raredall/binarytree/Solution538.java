package com.raredall.binarytree;

/**
 * 538. 把二叉搜索树转换为累加树
 *
 * @author Raredall
 */
public class Solution538 {

    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        inorder(root);
        return root;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(node.right);
        sum = node.val += sum;
        inorder(node.left);
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
