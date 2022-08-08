package com.chern.leetcode.other.easy.move_zeroes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public void moveZeroes(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j){
            if(nums[i] == 0){
                reverse(i, j, nums);
                j--;
                reverse(i, j, nums);
            }
            if (nums[i] != 0){
                i++;
            }
        }
    }

    private int[] reverse(int k, int j, int[] arr){
        while (k < j){
            int temp = arr[j];
            arr[j--] = arr[k];
            arr[k++] = temp;
        }

        return arr;
    }
}
