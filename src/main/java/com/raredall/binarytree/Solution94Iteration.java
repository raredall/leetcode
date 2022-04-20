package com.raredall.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 *
 * @author Raredall
 */
public class Solution94Iteration {

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null || !deque.isEmpty()) {
            if (cur != null) {
                deque.offerLast(cur);
                cur = cur.left;
            } else {
                cur = deque.pollLast();
                res.add(cur.val);
                cur = cur.right;
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
