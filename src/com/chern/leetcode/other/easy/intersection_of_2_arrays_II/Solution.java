package com.chern.leetcode.other.easy.intersection_of_2_arrays_II;

import java.util.*;

public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length;
        int length2 = nums2.length;
        int num1_pointer = 0, num2_pointer = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (num1_pointer < length1 && num2_pointer < length2){
            if (nums1[num1_pointer] == nums2[num2_pointer]){
                result.add(nums1[num1_pointer++]);
                num2_pointer++;
            } else {
                if (nums1[num1_pointer] < nums2[num2_pointer]){
                    num1_pointer++;
                } else {
                    num2_pointer++;
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
