package Dynamic_Programming.Climbing_Stairs;

//70. Climbing Stairs
public class Q70 {
    public static void main(String[] args) {
        int n=3;
        System.out.println(climbStairs2(n));
    }
    //too much time
    public static int climbStairs2(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;

        return climbStairs(n-1)+climbStairs(n-2);
    }

    public static int climbStairs(int n) {

        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            if(i<=2){
                dp[i]=i;
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }

}
