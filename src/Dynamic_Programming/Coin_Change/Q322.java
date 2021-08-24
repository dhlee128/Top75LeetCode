package Dynamic_Programming.Coin_Change;

import java.util.Arrays;
//322. Coin Change
public class Q322 {

    public static void main(String[] args) {
        int[] coins={1,2147483647};
        int amount=2;
        System.out.println(coinChange(coins,amount));
    }
    public static int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;

        int[] arr=new int[amount+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[0]=0;
        for(int i=0;i<=amount;i++){
            if(arr[i]==Integer.MAX_VALUE) continue;
            for(int coin:coins){
                if(coin>amount-i) continue;
                arr[coin+i]=Math.min(arr[i]+1,arr[i+coin]);
            }
        }
        return arr[amount]==Integer.MAX_VALUE?-1:arr[amount];
    }
}
