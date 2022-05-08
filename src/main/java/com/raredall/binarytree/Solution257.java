package com.raredall.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 *
 * @author Raredall
 */
public class Solution257 {

    private final List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        preorder(root, "");
        return result;
    }

    private void preorder(TreeNode node, String path) {
        if (node.left == null && node.right == null) {
            result.add(path + node.val);
            return;
        }
        path = path + node.val + "->";
        if (node.left != null) {
            preorder(node.left, path);
        }
        if (node.right != null) {
            preorder(node.right, path);
        }
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
