package com.raredall.string;

/**
 * 459. 重复的子字符串
 *
 * @author Raredall
 */
public class Solution459 {

    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        int[] next = getNext(s);
        return next[length - 1] != 0 && length % (length - next[length - 1]) == 0;
    }

    private int[] getNext(String s) {
        int length = s.length();
        int[] next = new int[length];
        int j = 0;
        next[0] = j;
        for (int i = 1; i < length; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

}
