package com.chern.leetcode.other.easy.plus_one;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public int[] plusOne(int[] digits) {
        ArrayList<Integer> result = new ArrayList<>();
        int inc = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + inc == 10 && inc != 0){
                result.add(0);
            } else {
                result.add(digits[i] + inc);
                inc = 0;
            }
        }
        if (inc == 1){
            result.add( 1);
        }
        Collections.reverse(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] plusOne_2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

}
