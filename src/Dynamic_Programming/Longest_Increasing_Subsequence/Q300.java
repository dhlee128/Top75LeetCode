package Dynamic_Programming.Longest_Increasing_Subsequence;

import java.util.Arrays;

//300. Longest Increasing Subsequence
public class Q300 {
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {

        int len=nums.length;
        int[] arr=new int[len];

        for(int i=0;i<len;i++){
            arr[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    arr[i]=Math.max(arr[i],arr[j]+1);
                }
            }
        }
        int max=1;
        for(int num:arr){
            max=Math.max(max,num);
        }
        return max;
    }
}
