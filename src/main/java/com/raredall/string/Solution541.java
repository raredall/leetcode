package com.raredall.string;

/**
 * 541. 反转字符串 II
 *
 * @author Raredall
 */
public class Solution541 {

    public String reverseStr(String s, int k) {
        int length = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k, length) - 1;
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(chars);
    }

}
