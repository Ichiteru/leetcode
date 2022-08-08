package com.chern.leetcode.graphs.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final int INFINITY = 1000000000;

    public static void main(String[] args) {
        HashMap<String, Map<String, Integer>> graph = new HashMap<>();
        Map<String, Integer> costs = new HashMap<>();
        Map<String, String> parents = new HashMap<>();
        ArrayList<String> processed = new ArrayList<>();

        graph.put("start", Map.of("A", 6, "B", 2));
        graph.put("A", Map.of("fin", 1));
        graph.put("B", Map.of("fin", 5, "A", 3));
        graph.put("fin", Collections.emptyMap());

        costs.put("start", 0);
        costs.put("A", INFINITY);
        costs.put("B", INFINITY);
        costs.put("fin", INFINITY);

        parents.put("A", "start");
        parents.put("B", "start");
        parents.put("fin", "None");

        Map<String, Integer> optimizeCosts = new Solution().dijkstra(graph, costs, parents);
        System.out.println(optimizeCosts.toString());
    }
}
