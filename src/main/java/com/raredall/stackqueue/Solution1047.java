package com.raredall.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1047. 删除字符串中的所有相邻重复项
 *
 * @author Raredall
 */
class Solution1047 {

    public String removeDuplicates(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            Character top = deque.peekLast();
            if (top != null && c == top) {
                deque.pollLast();
            } else {
                deque.offerLast(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        Character c;
        while ((c = deque.pollFirst()) != null) {
            sb.append((char) c);
        }
        return sb.toString();
    }

}
