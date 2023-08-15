package com.raredall;

import com.raredall.backtracking.Solution93;

import java.util.List;

/**
 * @author Raredall
 */
public class Test {

    public static void main(String[] args) {
        Solution93 solution93 = new Solution93();
        List<String> ipAddresses = solution93.restoreIpAddresses("101023");
        System.out.println(ipAddresses);
    }

}
