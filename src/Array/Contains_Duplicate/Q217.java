package Array.Contains_Duplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//217. Contains Duplicate
public class Q217 {

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],1);
            }
        }

        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {

        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
