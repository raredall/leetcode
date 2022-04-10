package com.raredall.string;

/**
 * 28. 实现 strStr()
 *
 * @author Raredall
 */
public class Solution28 {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int lh = haystack.length();
        int ln = needle.length();
        int[] next = getNext(needle);
        int j = 0;
        for (int i = 0; i < lh; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == ln) {
                return i - ln + 1;
            }
        }

        return -1;
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
