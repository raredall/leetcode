package com.raredall.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 *
 * @author Raredall
 */
public class Solution145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }

    private void postorder(TreeNode cur, List<Integer> list) {
        if (cur == null) {
            return;
        }
        postorder(cur.left, list);
        postorder(cur.right, list);
        list.add(cur.val);
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
