package com.raredall.string;

/**
 * 151. 颠倒字符串中的单词
 *
 * @author Raredall
 */
public class Solution151 {

    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int length = s.length();
        int left = length - 1;
        while (left >= 0) {
            int right = left;
            while (right >= 0 && s.charAt(right) == ' ') {
                right--;
            }
            left = right;
            while (left >= 0 && s.charAt(left) != ' ') {
                left--;
            }
            if (right >= 0) {
                res.append(s, left + 1, right + 1);
                res.append(" ");
            }
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }

}
