package com.raredall.string;

/**
 * 剑指 Offer 05. 替换空格
 *
 * @author Raredall
 */
public class Solution05 {

    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        s.chars().forEach(c -> sb.append(c == ' ' ? "%20" : (char) c));
        return sb.toString();
    }

}
