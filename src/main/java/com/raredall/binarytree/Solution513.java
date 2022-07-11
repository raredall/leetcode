package com.raredall.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 513. 找树左下角的值
 *
 * @author Raredall
 */
public class Solution513 {

    public int findBottomLeftValue(TreeNode root) {
        int res = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null) {
            queue.offer(root);
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (i == 0) {
                    res = node.val;
                }
            }
        }

        return res;
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
