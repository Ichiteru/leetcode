package com.chern.leetcode.graphs.widthsearch;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WidthSearch {

    public static boolean widthSearch(String start, String searched, Map<String, List<String>> graph) {
        LinkedList<String> queue = new LinkedList<>();
        LinkedList<String> checked = new LinkedList<>();
        queue.push(start);
        while (!queue.isEmpty()) {
            String popped = queue.pop();
            if (!checked.contains(popped)) {
                if (popped.equals(searched)) {
                    return true;
                } else {
                    queue.addAll(graph.get(popped));
                    checked.push(popped);
                }
            }
        }
        return false;
    }

}

