package com.raredall.hashtable;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 349. 两个数组的交集
 *
 * @author Raredall
 */
public class Solution349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums2).filter(set::contains).distinct().toArray();
    }

}
