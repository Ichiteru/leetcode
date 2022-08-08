package com.chern.leetcode.sort.quicksort;

import java.util.*;
import java.util.stream.Collectors;

public class QuickSort {

    public static List<Integer> quickSort(List<Integer> array){
        if (array.size() < 2){
            return array;
        } else {
            int delimiter = array.remove((0 + array.size()-1) / 2);
//            int delimiter = array.remove(0);
            Map<Boolean, List<Integer>> subArraysMap = array.stream().collect(Collectors.partitioningBy(el -> el <= delimiter));
            List<Integer> left = quickSort(subArraysMap.get(true));
            left.add(delimiter);
            left.addAll(quickSort(subArraysMap.get(false)));
            return left;
        }
    }


}
