package com.chern.leetcode.other.easy.contains_duplicate;

import java.util.HashSet;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> digits = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (digits.contains(nums[i])){
                return true;
            } else {
                digits.add(nums[i]);
            }
        }
        return false;
    }

}
