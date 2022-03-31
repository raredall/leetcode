package com.raredall.hashtable;

/**
 * 383. 赎金信
 *
 * @author Raredall
 */
public class Solution383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hash = new int[26];
        ransomNote.chars().forEach(c -> hash[c - 'a']++);
        magazine.chars().forEach(c -> hash[c - 'a']--);
        for (int i : hash) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }

}
