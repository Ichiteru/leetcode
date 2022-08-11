package com.chern.leetcode.other.easy.valid_anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map1.containsKey(c)){
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (map2.containsKey(c)){
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }
        return map1.equals(map2);

    }

}
