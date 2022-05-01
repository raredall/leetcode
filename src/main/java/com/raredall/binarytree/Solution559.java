package com.raredall.binarytree;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * 559. N 叉树的最大深度
 *
 * @author Raredall
 */
public class Solution559 {

    public int maxDepth(Node root) {
        int res = 0;
        Queue<Node> queue = new ArrayDeque<>();
        if (root != null) {
            queue.offer(root);
        }

        while (!queue.isEmpty()) {
            res++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                for (Node child : node.children) {
                    queue.offer(child);
                }
            }
        }

        return res;
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
