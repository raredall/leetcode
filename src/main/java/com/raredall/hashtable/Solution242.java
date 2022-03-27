package com.raredall.hashtable;

/**
 * 242. 有效的字母异位词
 *
 * @author Raredall
 */
public class Solution242 {

    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        s.chars().forEach(c -> record[c - 'a']++);
        t.chars().forEach(c -> record[c - 'a']--);
        for (int i : record) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}
