package com.raredall;

import com.raredall.backtracking.Solution491;

import java.util.List;

/**
 * @author Raredall
 */
public class Test {

    public static void main(String[] args) {
        Solution491 solution93 = new Solution491();
        List<List<Integer>> subsequences = solution93.findSubsequences(new int[]{4, 4, 3, 2, 1});
        System.out.println(subsequences);
    }

}
