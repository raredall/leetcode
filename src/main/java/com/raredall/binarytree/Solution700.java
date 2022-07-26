package com.raredall.binarytree;

/**
 * 700. 二叉搜索树中的搜索
 *
 * @author Raredall
 */
public class Solution700 {

    // 递归法
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    // 迭代法
//    public TreeNode searchBST(TreeNode root, int val) {
//        while (root != null) {
//            if (root.val > val) {
//                root = root.left;
//            } else if (root.val < val) {
//                root = root.right;
//            } else {
//                return root;
//            }
//        }
//        return null;
//    }

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
