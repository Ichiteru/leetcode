package com.chern.leetcode.graphs.widthsearch;

import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HashMap<String, List<String>> graph = new HashMap<>();
        graph.put("Cab", List.of("Car", "Cat"));
        graph.put("Car", List.of("Cat", "Bar"));
        graph.put("Bar", List.of("Bat"));
        graph.put("Cat", List.of("Mat" ,"Bat"));
        graph.put("Mat", List.of("Bat"));
        graph.put("Bat", List.of("Bat2"));
        graph.put("Bat2", List.of());
        boolean isExists = WidthSearch.widthSearch("Cab", "Bat23", graph);
        System.out.println("Exists: " + isExists);
    }
}
