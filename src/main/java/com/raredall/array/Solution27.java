package com.raredall.array;

/**
 * 27. 移除元素
 *
 * @author Raredall
 */
public class Solution27 {

    public int removeElement(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

}
