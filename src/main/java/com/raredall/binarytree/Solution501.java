package com.raredall.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 501. 二叉搜索树中的众数
 *
 * @author Raredall
 */
public class Solution501 {

    private TreeNode pre = null;

    private int maxCount = 0;

    private int count = 0;

    private final List<Integer> result = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inOrder(root);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        if (pre != null) {
            if (node.val == pre.val) {
                count++;
            } else {
                count = 1;
            }
        } else {
            count = 1;
        }
        if (count == maxCount) {
            result.add(node.val);
        } else if (count > maxCount) {
            maxCount = count;
            result.clear();
            result.add(node.val);
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
