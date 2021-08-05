package Array._3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//15. 3Sum
public class Q15 {
    public static void main(String[] args) {
        int[] nums={-2,0,1,1,2};
        List<List<Integer>> res=threeSum(nums);
        for(List<Integer> list : res){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        if(nums.length<3) return list;
        Arrays.sort(nums);

        int len=nums.length;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=len-1;
            if(left>right) break;//?==

            while(right>left){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> sub_list=new ArrayList<>();
                    sub_list.add(nums[i]);
                    sub_list.add(nums[left]);
                    sub_list.add(nums[right]);
                    Collections.sort(sub_list);
                    if(!list.contains(sub_list)) list.add(sub_list);
                }
                if(sum>=0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return list;
    }
}
