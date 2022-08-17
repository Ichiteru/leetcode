package com.chern.leetcode.arrays.tournament_winner;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 Tournament Winner
 There's an algorithms tournament taking place in which teams of programmers compete against each other to solve algorithmic problems as fast as
 possible. Teams compete in a round robin, where each team faces off against all other teams. Only two teams compete against each other at a time, and
 for each competition, one team is designated the home team, while the other team is the away team. In each competition there's always one winner and
 one loser; there are no ties. A team receives 3 points if it wins and O points if it loses. The winner of the tournament is the team that receives the most
 amount of points.
 Given an array of pairs representing the teams that have competed against each other and an array containing the results of each competition, write a
 function that returns the winner of the tournament. The input arrays are named competitions and results , respectively. The competitions
 array has elements in the form of [homeTeam, awayTeam] , where each team is a string of at most 30 characters representing the name of the team.
 The results arraycontains information about the winner ofeach corresponding competition in the competitions array. Specifically, results[1]
 denotes the winner of competitions(i) where a 1 in the results array means thathe home team in the corresponding competition won and a
 o means that the awayteam won.
 It's guaranteed that exactly one team will win the tournament and that each team will compete against all other teams exactly once. It's also guaranteed
 that the tournament will always have at least two teams.
 **/
public class Solution {

    public String tournamentWinner(String[][] competitions, int[] results){

        Map<String, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < competitions.length; i++){

            // home team win
            if (results[i] == 1){
               resultMap.putIfAbsent(competitions[i][0], 0);
               resultMap.put(competitions[i][0], resultMap.get(competitions[i][0])+3);
            // away team win
            } else {
                resultMap.putIfAbsent(competitions[i][1], 0);
                resultMap.put(competitions[i][1], resultMap.get(competitions[i][1])+3);
            }
        }
        Integer max_points = Collections.max(resultMap.values());
        for(String s : resultMap.keySet()){
            if (resultMap.get(s) == max_points){
                return s;
            }
        }
        return "";
    }
}
