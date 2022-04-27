package com.raredall.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 111. 二叉树的最小深度
 *
 * @author Raredall
 */
public class Solution111 {

    public int minDepth(TreeNode root) {
        int depth = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null) {
            queue.offer(root);
        }

        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return depth;
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
