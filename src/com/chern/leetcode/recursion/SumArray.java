package com.chern.leetcode.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumArray {

    // return sum array elements
    public static int sumArray(List<Integer> array){
        if (array.isEmpty()){
            return 0;
        }
        return array.remove(array.size() -1 ) + sumArray(array);
    }

    // return array size
    public static int countSize(List<Integer> array){
        if (array.isEmpty()){
            return 0;
        }
        array.remove(array.size() - 1);
        return 1 + countSize(array);
    }
    // return the biggest value from array
    public static int biggestDigit(List<Integer> array){
        if (array.size() == 1){
            return array.get(0);
        }
        Integer first = array.get(0);
        Integer last = array.get(array.size() - 1);
        if (first < last){
            Collections.swap(array, 0, array.size()-1);
        }
        array.remove(array.size() - 1);
        return biggestDigit(array);
    }
}
