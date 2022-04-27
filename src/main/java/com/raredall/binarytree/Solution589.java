package com.raredall.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N 叉树的前序遍历
 *
 * @author Raredall
 */
public class Solution589 {

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }

        list.add(node.val);
        for (Node child : node.children) {
            preorder(child, list);
        }
    }

    private static class Node {

        public int val;

        public List<Node> children;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }

    }

}
