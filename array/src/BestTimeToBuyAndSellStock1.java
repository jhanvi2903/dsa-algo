/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

Maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 */


public class BestTimeToBuyAndSellStock1 {

    public static int buyAndSellStock(int[] arr){

        int profit=0;
        int max_profit=0;
        int left=0;
        int right=1;

        while(right< arr.length){
            if(arr[left]< arr[right]){
                profit=arr[right]-arr[left];
                max_profit=Math.max(max_profit,profit);
            }else{
                left=right;
            }
            right++;

        }

        return max_profit;

    }

    public static void main(String[] args){
        int[] arr={7,2,3,5,6,1,4};
        System.out.println(buyAndSellStock(arr));

    }
}

/*
Expected Output - 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
