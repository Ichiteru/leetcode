package com.chern.leetcode.graphs.dijkstra;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {

    private static final int INFINITY = 1000000000;

    public Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> graph,
                                         Map<String, Integer> costs,
                                         Map<String, String> parents){

        // Processed elements
        ArrayList<String> processed = new ArrayList<>();
        String node = findNodeWithLowestCostFromUnprocessed(costs, processed);
        while (!node.equals("None")){
            Integer cost = costs.get(node);
            Map<String, Integer> neighbors = graph.get(node);
            for (String key : neighbors.keySet()) {
                int new_cost = cost + neighbors.get(key);
                if (costs.get(key) > new_cost){
                    costs.put(key, new_cost);
                    parents.put(key, node);
                }
            }
            processed.add(node);
            node = findNodeWithLowestCostFromUnprocessed(costs, processed);
        }
        return costs;
    }

    private String findNodeWithLowestCostFromUnprocessed(Map<String, Integer> costs, List<String> processed){
            int lowestCost = INFINITY;
            String lowestCostNode = "None";
        for (String key : costs.keySet()) {
            int cost = costs.get(key);
            if (cost < lowestCost && !processed.contains(key)){
                lowestCost = cost;
                lowestCostNode = key;
            }
        }
        return lowestCostNode;
    }
}
