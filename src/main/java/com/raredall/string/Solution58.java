package com.raredall.string;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 *
 * @author Raredall
 */
public class Solution58 {

    public String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        res.append(s, n, s.length());
        res.append(s, 0, n);
        return res.toString();
    }

}
