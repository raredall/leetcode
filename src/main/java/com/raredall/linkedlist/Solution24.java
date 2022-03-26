package com.raredall.linkedlist;

/**
 * 24. 两两交换链表中的节点
 *
 * @author Raredall
 */
public class Solution24 {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = cur;
            prev.next = next;

            prev = cur;
            cur = cur.next;
        }
        return dummy.next;
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
