package com.chern.leetcode.other.easy.single_number;

import java.util.HashSet;

class Solution {

    public int singleNumber(int[] nums) {
        HashSet<Integer> digits = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!digits.contains(nums[i])){
                digits.add(nums[i]);
            } else {
                digits.remove(nums[i]);
            }
        }
        return (int) digits.toArray()[0];
    }
}