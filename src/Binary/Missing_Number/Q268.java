package Binary.Missing_Number;

import java.util.Arrays;

//268. Missing Number
public class Q268 {

    public static int missingNumber(int[] nums) {

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]) return i;
        }
        return nums.length;
    }

    public static int missingNumber2(int[] nums) {

        int sum=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        return (len*(len+1))/2-sum;
    }

    public static void main(String[] args){

        int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }

}
