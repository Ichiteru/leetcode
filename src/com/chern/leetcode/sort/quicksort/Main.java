package com.chern.leetcode.sort.quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(23,56,43,12,21,87,56,45,76,34,58,25,7,12,4));
        for (int i = 0; i < 1000000; i++) {
             Double doubled = Math.random() * 1000;
             array.add(doubled.intValue());
        }
        long start = System.currentTimeMillis();
        System.out.println(QuickSort.quickSort(array));
        long stop = System.currentTimeMillis();
        System.out.println(stop-start);
    }
}
