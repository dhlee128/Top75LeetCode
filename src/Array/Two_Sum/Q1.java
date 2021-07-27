package Array.Two_Sum;

import java.util.ArrayList;
import java.util.List;

//1. Two Sum
public class Q1 {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        twoSum(nums,target);
    }

    public static int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]) return new int[]{i,j};
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])) return new int[]{list.indexOf(nums[i]),i};
            list.add(target-nums[i]);
        }

        return null;
    }
}
