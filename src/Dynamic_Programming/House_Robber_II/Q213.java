package Dynamic_Programming.House_Robber_II;

//213. House Robber II
public class Q213 {

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,1,2,3,4,5};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {

        int len=nums.length;
        if(len==1) return nums[0];
        if(len==2) return Math.max(nums[0],nums[1]);
        if(len==3) return Math.max(Math.max(nums[0],nums[1]),nums[2]);

        return Math.max(robHouse(nums,0,len-1),robHouse(nums,1,len));
    }

    static int robHouse(int[]nums,int lo,int hi){
        int len=nums.length;

        int[] arr=new int[len+1];

        arr[lo]=nums[lo];
        arr[lo+1]=Math.max(nums[lo],nums[lo+1]);

        for(int i=(lo+2);i<hi;i++){
            arr[i]=Math.max(arr[i-2]+nums[i],arr[i-1]);
        }
        return arr[hi-1];
    }
}
