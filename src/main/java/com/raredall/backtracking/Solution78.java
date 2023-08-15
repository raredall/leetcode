package com.raredall.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 *
 * @author Raredall
 */
public class Solution78 {

    private final List<List<Integer>> result = new ArrayList<>();

    private final List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums, 0);
        return result;
    }

    private void backtracking(int[] nums, int start) {
        result.add(new ArrayList<>(path));
        if (start >= nums.length) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }

}
