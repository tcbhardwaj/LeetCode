package com.practice.array;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int i = 0;
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;

        while(i < prices.length) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            int todaysProfit = prices[i] - buyPrice;
            if(profit < todaysProfit) {
                profit = todaysProfit;
            }
            i++;
        }

        return profit;

    }
}