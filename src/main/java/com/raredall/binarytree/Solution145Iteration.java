package com.raredall.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 *
 * @author Raredall
 */
public class Solution145Iteration {

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.offerLast(root);
        while (!deque.isEmpty()) {
            TreeNode cur = deque.pollLast();
            res.add(cur.val);
            if (cur.left != null) {
                deque.offerLast(cur.left);
            }
            if (cur.right != null) {
                deque.offerLast(cur.right);
            }
        }
        Collections.reverse(res);
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
