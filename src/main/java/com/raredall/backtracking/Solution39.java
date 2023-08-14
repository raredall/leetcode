package com.raredall.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. 组合总和
 *
 * @author Raredall
 */
public class Solution39 {

    private final List<List<Integer>> result = new ArrayList<>();

    private final List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, 0);
        return result;
    }

    private void backtracking(int[] candidates, int target, int sum, int start) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
        }

        for (int i = start; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                return;
            }
            path.add(candidates[i]);
            backtracking(candidates, target, sum + candidates[i], i);
            path.remove(path.size() - 1);
        }
    }

}
