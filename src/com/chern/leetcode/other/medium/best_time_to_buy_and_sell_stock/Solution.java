package com.chern.leetcode.other.medium.best_time_to_buy_and_sell_stock;

//You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//On each day, you may decide to buy and/or sell the stock.
//You can only hold at most one share of the stock at any time.
//However, you can buy it then immediately sell it on the same day.
//Find and return the maximum profit you can achieve.

public class Solution {

    public int maxProfit(int[] prices) {
        int hold = 0;
        boolean have = false;
        int earn = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int money = prices[i+1] - prices[i];
            if(money > 0){
                if (!have){
                    hold = prices[i];
                    have = true;
                }
            }
            else if (money < 0) {
                if  (have) {
                    earn += prices[i] - hold;
                    have = false;
                }
            }
        }
        if (have){
            earn += prices[prices.length - 1] - hold;
        }
        return earn;
    }
}
