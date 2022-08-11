package com.chern.leetcode.other.easy.atoi;

public class Solution {

    public int myAtoi(String s) {

        char[] chars = s.trim().toCharArray();
        long result = 0;
        boolean isPositive = true;
        boolean isStartWithZero = true;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 && chars[i] == '-'){
                isPositive = false;
            } else if (i == 0 && chars[i] == '+'){
                isPositive = true;
            } else if (isStartWithZero && chars[i] == 48){
                continue;
            } else {
                isStartWithZero = false;
                if (Character.isDigit(chars[i])){
                    if(isPositive){
                        if ((result * 10) + (chars[i] - 48) <= Integer.MAX_VALUE){
                            result = (result * 10) + (chars[i] - 48);
                        } else {
                            return Integer.MAX_VALUE;
                        }
                    } else {
                        if ((-1)*((result * 10) + (chars[i] - 48)) >= Integer.MIN_VALUE){
                            result = (result*10) + (chars[i] - 48);
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    }
                }else {
                    return isPositive ? (int)result : (int)result*(-1);
                }
            }
        }

        return isPositive ? (int)result : (int)result*(-1);
    }
}
