package com.chern.leetcode.other.easy.valid_palindrome;

class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = removeNonAlphanumeric(s).toUpperCase().toCharArray();
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            if(arr[i++] != arr[j--]){
                return false;
            }

        }
        return true;
    }

    public static String removeNonAlphanumeric(String str)
    {
        // replace the given string
        // with empty string
        // except the pattern "[^a-zA-Z0-9]"
        str = str.replaceAll(
                "[^a-zA-Z0-9]", "");

        // return string
        return str;
    }
}