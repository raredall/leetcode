package com.raredall.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 150. 逆波兰表达式求值
 *
 * @author Raredall
 */
class Solution150 {

    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (String token : tokens) {
            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                int n1 = deque.pollLast();
                int n2 = deque.pollLast();
                switch (token) {
                    case "+" -> deque.offerLast(n2 + n1);
                    case "-" -> deque.offerLast(n2 - n1);
                    case "*" -> deque.offerLast(n2 * n1);
                    case "/" -> deque.offerLast(n2 / n1);
                }
            } else {
                deque.offerLast(Integer.valueOf(token));
            }
        }
        return deque.pollLast();
    }

}
