package com.chern.leetcode.arrays.non_constructible_change;

import java.util.Arrays;

public class Solution {

    public int nonConstructibleChange(int[] coins) {
       Arrays.sort(coins);
       int max_constructible = 0;
       for(int coin : coins){
            if (coin > max_constructible + 1){
                return max_constructible + 1;
            }
            max_constructible = max_constructible + coin;
       }
       return max_constructible + 1;
    }

}
