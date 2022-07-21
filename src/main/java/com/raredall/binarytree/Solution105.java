package com.raredall.binarytree;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 *
 * @author Raredall
 */
public class Solution105 {

    private final Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length,
                inorder, 0, inorder.length);
    }

    private TreeNode buildTree(int[] preorder, int preBegin, int preEnd,
                               int[] inorder, int inBegin, int inEnd) {
        if (preBegin >= preEnd || inBegin >= inEnd) {
            return null;
        }

        int rootValue = preorder[preBegin];
        TreeNode root = new TreeNode(rootValue);

        int index = map.get(rootValue);
        root.left = buildTree(preorder, preBegin + 1, preBegin + 1 + index - inBegin,
                inorder, inBegin, index);
        root.right = buildTree(preorder, preBegin + 1 + index - inBegin, preEnd,
                inorder, index + 1, inEnd);

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
