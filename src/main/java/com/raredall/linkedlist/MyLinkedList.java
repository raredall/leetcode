package com.raredall.linkedlist;

/**
 * 707. 设计链表
 *
 * @author Raredall
 */
class MyLinkedList {

    private final Node head;

    private final Node tail;

    private int size;

    public MyLinkedList() {
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        return cur.next.val;
    }

    public void addAtHead(int val) {
        addNode(head, val);
    }

    public void addAtTail(int val) {
        addNode(tail.prev, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            addAtHead(val);
        }

        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        addNode(cur, val);
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next.next.prev = cur;
        cur.next = cur.next.next;
        size--;
    }

    private void addNode(Node cur, int val) {
        Node node = new Node(val);
        node.next = cur.next;
        cur.next.prev = node;
        node.prev = cur;
        cur.next = node;
        size++;
    }

    private static class Node {

        private int val;

        private Node prev;

        private Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

    }

}
