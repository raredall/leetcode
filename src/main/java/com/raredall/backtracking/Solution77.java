package com.raredall.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 *
 * @author Raredall
 */
public class Solution77 {

    private final List<List<Integer>> result = new ArrayList<>();

    private final List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return result;
    }

    private void backtracking(int n, int k, int start) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backtracking(n, k, i + 1);
            path.remove(path.size() - 1);
        }
    }

}
