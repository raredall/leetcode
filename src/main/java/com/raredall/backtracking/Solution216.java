package com.raredall.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 216. 组合总和 III
 *
 * @author Raredall
 */
public class Solution216 {

    private final List<List<Integer>> result = new ArrayList<>();

    private final List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k, n, 0, 1);
        return result;
    }

    private void backtracking(int k, int n, int sum, int start) {
        if (path.size() == k) {
            if (sum == n) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = start; i <= 9 - (k - path.size()) + 1; i++) {
            if (sum + i > n) {
                return;
            }
            path.add(i);
            backtracking(k, n, sum + i, i + 1);
            path.remove(path.size() - 1);
        }
    }

}
