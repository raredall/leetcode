
package com.raredall.linkedlist;

/**
 * 142. 环形链表 II
 *
 * @author Raredall
 */
public class Solution142 {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode node1 = fast;
                ListNode node2 = head;
                while (node1 != node2) {
                    node1 = node1.next;
                    node2 = node2.next;
                }
                return node1;
            }
        }

        return null;
    }

    private static class ListNode {

        private int val;

        private ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

    }

}
