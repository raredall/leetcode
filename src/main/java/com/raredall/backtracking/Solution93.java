package com.raredall.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 93. 复原 IP 地址
 *
 * @author Raredall
 */
public class Solution93 {

    private final List<String> result = new ArrayList<>();

    private final List<String> path = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        backtracking(s, 0, 0);
        return result;
    }

    private void backtracking(String s, int start, int pointNum) {
        if (pointNum == 3) {
            if (isValid(s, start, s.length() - 1)) {
                path.add(s.substring(start));
                result.add(String.join(".", path));
                path.remove(path.size() - 1);
            }
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isValid(s, start, i)) {
                path.add(s.substring(start, i + 1));
                backtracking(s, i + 1, pointNum + 1);
                path.remove(path.size() - 1);
            } else {
                return;
            }
        }
    }

    private boolean isValid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) {
            return false;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum * 10 + (s.charAt(i) - '0');
            if (sum > 255) {
                return false;
            }
        }
        return true;
    }

}
