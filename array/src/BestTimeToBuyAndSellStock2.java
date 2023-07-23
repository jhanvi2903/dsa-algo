/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
 */

public class BestTimeToBuyAndSellStock2 {

    public static int maxProfit(int[] prices) {
        int profit=0;

        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit+= prices[i]-prices[i-1];
            }
        }

        return profit;
    }
    public static void main(String[] args){
        int[] arr={7,2,3,5,6,1,4};
        System.out.println(maxProfit(arr));

    }
}
