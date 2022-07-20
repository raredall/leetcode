package com.raredall.binarytree;

import java.util.*;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 *
 * @author Raredall
 */
public class Solution106 {

    private final Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(inorder, 0, inorder.length,
                postorder, 0, postorder.length);
    }

    private TreeNode buildTree(int[] inorder, int inBegin, int inEnd,
                               int[] postorder, int postBegin, int postEnd) {
        if (inBegin >= inEnd || postBegin >= postEnd) {
            return null;
        }

        int rootValue = postorder[postEnd - 1];
        TreeNode root = new TreeNode(rootValue);

        int index = map.get(rootValue);
        root.left = buildTree(inorder, inBegin, index,
                postorder, postBegin, postBegin + index - inBegin);
        root.right = buildTree(inorder, index + 1, inEnd,
                postorder, postBegin + index - inBegin, postEnd - 1);

        return root;
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
