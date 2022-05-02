package com.raredall.binarytree;

/**
 * 222. 完全二叉树的节点个数
 *
 * @author Raredall
 */
public class Solution222 {

    public int countNodes(TreeNode root) {
        return getNodesNum(root);
    }

    private int getNodesNum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = 0;
        TreeNode cur = node;
        while (cur != null) {
            cur = cur.left;
            leftHeight++;
        }
        int rightHeight = 0;
        cur = node;
        while (cur != null) {
            cur = cur.right;
            rightHeight++;
        }

        if (leftHeight == rightHeight) {
            return (1 << leftHeight) - 1;
        }
        return getNodesNum(node.left) + getNodesNum(node.right) + 1;
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
