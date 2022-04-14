package com.raredall.stackqueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 20. 有效的括号
 *
 * @author Raredall
 */
class Solution20 {

    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();

        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                deque.offerLast(')');
            } else if (c == '[') {
                deque.offerLast(']');
            } else if (c == '{') {
                deque.offerLast('}');
            } else {
                Character top = deque.pollLast();
                if (top == null || c != top) {
                    return false;
                }
            }
        }

        return deque.isEmpty();
    }

}
