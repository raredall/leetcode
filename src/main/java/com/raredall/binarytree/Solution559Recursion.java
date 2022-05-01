package com.raredall.binarytree;

import java.util.List;

/**
 * 559. N 叉树的最大深度
 *
 * @author Raredall
 */
public class Solution559Recursion {

    public int maxDepth(Node root) {
        return getDepth(root);
    }

    private int getDepth(Node node) {
        if (node == null) {
            return 0;
        }

        int maxDepth = 0;
        for (Node child : node.children) {
            int depth = getDepth(child);
            maxDepth = Math.max(maxDepth, depth);
        }

        return maxDepth + 1;
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
