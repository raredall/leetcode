package com.raredall.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 117. 填充每个节点的下一个右侧节点指针 II
 *
 * @author Raredall
 */
public class Solution117 {

    public Node connect(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        if (root != null) {
            queue.offer(root);
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                Node node = queue.poll();
                if (i != size) {
                    node.next = queue.peek();
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return root;
    }

    private static class Node {

        public int val;

        public Node left;

        public Node right;

        public Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }

    }

}
