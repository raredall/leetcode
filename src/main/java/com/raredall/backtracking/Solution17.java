package com.raredall.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. 电话号码的字母组合
 *
 * @author Raredall
 */
public class Solution17 {

    private final Map<Character, char[]> letterMap;

    private final StringBuilder combine = new StringBuilder();

    private final List<String> result = new ArrayList<>();

    public Solution17() {
        letterMap = new HashMap<>();
        letterMap.put('2', new char[]{'a', 'b', 'c'});
        letterMap.put('3', new char[]{'d', 'e', 'f'});
        letterMap.put('4', new char[]{'g', 'h', 'i'});
        letterMap.put('5', new char[]{'j', 'k', 'l'});
        letterMap.put('6', new char[]{'m', 'n', 'o'});
        letterMap.put('7', new char[]{'p', 'q', 'r', 's'});
        letterMap.put('8', new char[]{'t', 'u', 'v'});
        letterMap.put('9', new char[]{'w', 'x', 'y', 'z'});
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return result;
        }
        backtracking(digits, 0);
        return result;
    }

    private void backtracking(String digits, int index) {
        if (index == digits.length()) {
            result.add(combine.toString());
            return;
        }

        for (char c : letterMap.get(digits.charAt(index))) {
            combine.append(c);
            backtracking(digits, index + 1);
            combine.deleteCharAt(combine.length() - 1);
        }
    }

}
