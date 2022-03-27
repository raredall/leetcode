
package com.raredall.linkedlist;

/**
 * 面试题 02.07. 链表相交
 *
 * @author Raredall
 */
public class Solution0207 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        ListNode curA = headA;
        while (curA != null) {
            curA = curA.next;
            sizeA++;
        }

        int sizeB = 0;
        ListNode curB = headB;
        while (curB != null) {
            curB = curB.next;
            sizeB++;
        }

        if (sizeB > sizeA) {
            int tempSize = sizeA;
            sizeA = sizeB;
            sizeB = tempSize;
            ListNode tempNode = headA;
            headA = headB;
            headB = tempNode;
        }

        curA = headA;
        curB = headB;
        int gap = sizeA - sizeB;
        for (int i = 0; i < gap; i++) {
            curA = curA.next;
        }
        while (curA != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
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
