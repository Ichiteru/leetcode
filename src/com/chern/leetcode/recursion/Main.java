package com.chern.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(9, 6, 10, 8, 9));
//        System.out.println(SumArray.sumArray(arr));
//        System.out.println(SumArray.countSize(arr));
        System.out.println(SumArray.biggestDigit(arr));
    }
}
