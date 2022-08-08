package com.chern.leetcode.sort.bychoise;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(List.of(5,1,324,6,23,564,23,76,34,4234,867,342));
        ArrayList<Integer> sortArray = new SortByChoise().sortByChoise(array);
        System.out.println(sortArray.toString());
    }
}
