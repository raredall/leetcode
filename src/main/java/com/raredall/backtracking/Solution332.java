package com.raredall.backtracking;

import java.util.*;

/**
 * 332. 重新安排行程
 *
 * @author Raredall
 */
public class Solution332 {

    private final Map<String, Map<String, Integer>> targets = new HashMap<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            Map<String, Integer> map = targets.computeIfAbsent(ticket.get(0), k -> new TreeMap<>());
            map.put(ticket.get(1), map.getOrDefault(ticket.get(1), 0) + 1);
        }
        List<String> result = new ArrayList<>();
        result.add("JFK");
        backtracking(result, tickets.size());
        return result;
    }

    private boolean backtracking(List<String> result, int ticketNum) {
        if (result.size() == ticketNum + 1) {
            return true;
        }

        String last = result.get(result.size() - 1);
        if (targets.containsKey(last)) {
            for (Map.Entry<String, Integer> entry : targets.get(last).entrySet()) {
                if (entry.getValue() > 0) {
                    result.add(entry.getKey());
                    entry.setValue(entry.getValue() - 1);
                    if (backtracking(result, ticketNum)) {
                        return true;
                    }
                    result.remove(result.size() - 1);
                    entry.setValue(entry.getValue() + 1);
                }
            }
        }
        return false;
    }

}
