package BuyAndSellStock;
/*
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */

public class BuyAndSellTest {
    public static void main(String[]args){
        BuyAndSellStock buyAndSell = new BuyAndSellStock();

        var result = buyAndSell.maxProfit(new int[] {7,1,5,3,6,4});
        var result1 =  buyAndSell.maxProfit(new int[] {7,6,4,3,1});

       var result2 =  buyAndSell.maxProfitWithForLoop(new int[] {7,1,5,3,6,4});
       var result3 =  buyAndSell.maxProfitWithForLoop(new int[] {7,6,4,3,1});

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
