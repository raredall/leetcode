package com.raredall.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N 叉树的后序遍历
 *
 * @author Raredall
 */
public class Solution590 {

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }

    private void postorder(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }

        for (Node child : node.children) {
            postorder(child, list);
        }
        list.add(node.val);
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
