package com.chern.leetcode.sort.bychoise;

import java.util.ArrayList;

public class SortByChoise {

    private int smallest(ArrayList<Integer> arr){
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public ArrayList<Integer> sortByChoise(ArrayList<Integer> arr){
        ArrayList<Integer> newArr = new ArrayList<>();
        int initialSize = arr.size();
        for (int i = 0; i < initialSize; i++) {
            int smallestIndex = smallest(arr);
            Integer removed = arr.remove(smallestIndex);
            newArr.add(removed);
        }
        return newArr;
    }
}
