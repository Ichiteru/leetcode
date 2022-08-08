package com.chern.leetcode.binarysearch;

public class BinarySearch {

    static public int binarySearch(int[] array, int param){
        int low = 0;
        int high = array.length-1;
        while (low <= high){
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == param){
                return mid;
            }
            if (guess > param) {
                high = mid - 1;
            } else if (guess < param) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
