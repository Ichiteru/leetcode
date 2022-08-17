package com.chern.leetcode.arrays.tournament_winner;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[][] competitions = {
                {"HTML", "C#"},
                {"HTML", "Java"},
                {"C#", "Java"},
                {"C++", "Java"},
                {"HTML", "Python"},
        };
        int[] results = {1, 1, 0, 1, 1};
        System.out.println(new Solution().tournamentWinner(competitions, results));
    }
}
