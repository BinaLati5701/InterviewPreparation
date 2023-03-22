package BuyAndSellStock;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and
choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.

Constraints:

1 <= prices.length <= 10^5
0 <= prices[i] <= 10^4

 */

public class BuyAndSellStock {

    //region Buy And Sell with While Loop

    /**
     * Method uses Math.max
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int left = 0; //buy
        int right = 1; // sell
        while(right  < prices.length){
            if(prices[left] < prices[right]){
                int profit =  prices[right] - prices[left]; //current profit
                max_profit = Math.max(max_profit, profit);
            }
            else{
                left = right;
            }
            right ++;
        }
        return  max_profit;

    }
    //endregion

//region Buy And Sell with For Loop

    /**
     * Method uses Integer.MAX_VALUE
     * @param prices
     * @return
     */
    public int maxProfitWithForLoop(int[] prices) {
        int profit = 0;
        int min_value = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min_value){
                min_value = prices[i];
            }
            if (prices[i] - min_value > profit){
                profit = prices[i] - min_value;
            }
        }
        return profit;
    }
    //endregion
}
