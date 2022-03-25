package com.raredall.linkedlist;

/**
 * 203. 移除链表元素
 *
 * @author Raredall
 */
public class Solution203 {

    public ListNode removeElements(ListNode head, int val) {
        head = new ListNode(0, head);
        ListNode current = head;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head.next;
    }

    private static class ListNode {

        private int val;

        private ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

}
