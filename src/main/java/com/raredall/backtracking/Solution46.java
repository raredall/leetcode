package com.raredall.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. 全排列
 *
 * @author Raredall
 */
public class Solution46 {

    private final List<List<Integer>> result = new ArrayList<>();

    private final List<Integer> path = new ArrayList<>();

    private boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backtracking(nums);
        return result;
    }

    private void backtracking(int[] nums) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            backtracking(nums);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

}
