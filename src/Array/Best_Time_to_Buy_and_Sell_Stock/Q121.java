package Array.Best_Time_to_Buy_and_Sell_Stock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//121. Best Time to Buy and Sell Stock
public class Q121 {

    public static void main(String[] args) {
        int[] prices={7};
        System.out.println(maxProfit(prices));
    }
    //Time Limit Exceeded
    public static int maxProfit(int[] prices) {
        int profit=0;

        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                profit=Math.max(profit,prices[j]-prices[i]);
            }
        }
        return profit;
    }

    public static int maxProfit2(int[] prices) {
        int min= prices[0];
        int profit= 0;

        for(int i=1;i<prices.length;i++){
            profit=Math.max(profit,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }
}
