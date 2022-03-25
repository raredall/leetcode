package com.raredall.array;

/**
 * 977. 有序数组的平方
 *
 * @author Raredall
 */
public class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        int left = 0;
        int right = length - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                res[i] = nums[right] * nums[right];
                right--;
            } else {
                res[i] = nums[left] * nums[left];
                left++;
            }
        }
        return res;
    }
}
