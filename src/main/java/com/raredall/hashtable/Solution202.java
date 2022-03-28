package com.raredall.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. 快乐数
 *
 * @author Raredall
 */
public class Solution202 {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            if (n == 1) {
                return true;
            }

            int next = 0;
            while (n != 0) {
                int last = (n % 10);
                next += last * last;
                n /= 10;
            }
            n = next;
        }
        return false;
    }

}
