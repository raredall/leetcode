package com.raredall.stackqueue;

import java.util.*;

/**
 * 347. 前 K 个高频元素
 *
 * @author Raredall
 */
class Solution347 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Map.Entry.comparingByValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.stream().mapToInt(Map.Entry::getKey).toArray();
    }

}
