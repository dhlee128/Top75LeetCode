package Dynamic_Programming.Combination_Sum_IV;

import java.util.Arrays;

//377. Combination Sum IV
public class Q377 {

    public static void main(String[] args) {
        int[] nums={1,2,3};
        int target=7;
        System.out.println(combinationSum4(nums,target));
    }

    public static int combinationSum4(int[] nums, int target) {

        int[] arr=new int[target+1];
        arr[0]=1;
        for(int i=0;i<target;i++){
            for(int num:nums){
                if(num+i<=target){
                    arr[num+i]+=arr[i];
                }
            }
        }

        return arr[target];
    }
}
