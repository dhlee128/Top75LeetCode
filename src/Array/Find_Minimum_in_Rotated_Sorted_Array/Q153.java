package Array.Find_Minimum_in_Rotated_Sorted_Array;

//153. Find Minimum in Rotated Sorted Array
public class Q153 {

    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};//4,5,6,7,8,0,1 //11,13,15,17,18
        System.out.println(findMin(nums));

        int[] nums1={3,4,5,1,2};
        int[] nums2={4,8,0,1,2,3};
        int[] nums3={7,8,1,2,3,4,5,6};
    }

    public static int findMin(int[] nums) {
        int min_idx=0;
        int max_idx=nums.length-1;

        while(min_idx<max_idx){
            int mid_idx=(min_idx+max_idx)/2;
            if(nums[max_idx]<nums[mid_idx]){
                min_idx=mid_idx+1;
            }else{
                max_idx=mid_idx;
            }
        }
        return nums[max_idx];
    }

    public static int findMax(int[] nums) {
        int min_idx=0;
        int max_idx=nums.length-1;

        while(min_idx<max_idx){
            int mid_idx;
            if((min_idx+max_idx)%2==0){
                mid_idx=(min_idx+max_idx)/2;
            }else{
                mid_idx=(min_idx+max_idx+1)/2;
            }

            if(nums[min_idx]<nums[mid_idx]){
                min_idx=mid_idx;
            }else{
                max_idx=mid_idx-1;
            }
        }
        return nums[min_idx];
    }

}
