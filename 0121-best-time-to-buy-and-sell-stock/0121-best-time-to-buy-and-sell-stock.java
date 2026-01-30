class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int store = prices[0];

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < store) {
                store = prices[i];
            } else {
                profit = Math.max(profit, (prices[i] - store));
            }
        }

        return profit;
    }

}