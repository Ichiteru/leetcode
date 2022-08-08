package com.chern.leetcode.other.easy.rotate_array;

public class Solution {

    public void rotate(int[] nums, int k) {
        int temp;
        int previous;
        for (int i = 0; i < k; i++){
            previous = nums[nums.length - 1];
            for(int j = 0; j < nums.length - 1; j++){
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

}
