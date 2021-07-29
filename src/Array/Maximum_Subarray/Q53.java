package Array.Maximum_Subarray;

//53. Maximum Subarray
public class Q53 {
    public static void main(String[] args) {
        int[] nums={5,-2,3,2,7};
        System.out.println(maxSubArray2(nums));
    }
    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int len=nums.length;
        for(int i=0;i<len;i++){
            int sum=0;
            for(int j=i;j<len;j++){
                sum+=nums[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }

    public static int maxSubArray2(int[] nums) {
        int sum=nums[0];
        int max=nums[0];
        int len=nums.length;
        for(int i=1;i<len;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
}
