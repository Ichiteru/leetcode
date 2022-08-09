package com.chern.leetcode.other.easy.reverse_integer;

public class Solution {

    public int reverse(int x) {
        long result = 0;
        boolean negative = false;
        if (x < 0){
            negative = true;
            x *= -1;
        }
        while (x > 0 ){
            result = (result*10) + (x%10);
            x /= 10;
        }
        if (result > Integer.MAX_VALUE){
            return 0;
        }
        return negative ? (int) (-1 * result) : (int)result;
    }

}
