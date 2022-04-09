package com.raredall.hashtable;

/**
 * 344. 反转字符串
 *
 * @author Raredall
 */
public class Solution344 {

    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

}
