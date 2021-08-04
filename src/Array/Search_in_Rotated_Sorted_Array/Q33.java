package Array.Search_in_Rotated_Sorted_Array;

public class Q33 {
    public static void main(String[] args) {
        int[] nums={1,2};
        int target=2;

        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {

        int left=0;
        int right=nums.length-1;
        int mid;

        if(nums[left]==target) return left;
        if(nums[right]==target) return right;

        while(left<right){
            mid=(left+right)/2;
            if(nums[left]==target) return left;
            if(nums[right]==target) return right;
            if(nums[mid]==target) return mid;

            if(nums[left]<nums[mid]){
                if(nums[mid]<target){
                    left=mid+1;
                }else{
                    if(nums[left]>target){
                        left=mid+1;
                    }else if(nums[left]<target){
                        right=mid-1;
                    }
                }
            }else{
                if(nums[left]>target&&nums[mid]>target){
                    right=mid-1;
                }else if(nums[left]>target&&nums[mid]<target){
                    left=mid+1;
                }else if(nums[left]<target&&nums[mid]>target){
                    right=mid-1;
                }else if(nums[left]<target&&nums[mid]<target){
                    right=mid-1;
                }
            }
        }

        return -1;
    }
}
