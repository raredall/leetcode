package com.raredall.stackqueue;

import java.util.Stack;

/**
 * 232. 用栈实现队列
 *
 * @author Raredall
 */
class MyQueue {

    private final Stack<Integer> in;

    private final Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        transfer();
        return out.pop();
    }

    public int peek() {
        transfer();
        return out.peek();
    }

    public boolean empty() {
        return out.empty() && in.empty();
    }

    private void transfer() {
        if (out.empty()) {
            while (!in.empty()) {
                out.push(in.pop());
            }
        }
    }

}
