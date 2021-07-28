package Array.Product_of_Array_Except_Self;

//238. Product of Array Except Self
public class Q238 {

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        productExceptSelf2(nums);
    }
    //Time Limit Exceeded
    public static int[] productExceptSelf(int[] nums) {

        int[] res=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            nums[i]=1;
            int total=1;
            for(int num:nums){
                total*=num;
            }
            res[i]=total;
            nums[i]=temp;
        }
        return res;
    }

    public static int[] productExceptSelf2(int[] nums) {

        int size=nums.length;
        int[] res=new int[size];
        res[0]=1;

        for(int i=1;i<size;i++){
            res[i]=res[i-1]*nums[i-1];
        }

        int[] right=new int[size];
        right[size-1]=1;

        for(int i=size-1;i>=0;i--){
            res[i]=res[i]*right[i];
            if(i!=0) right[i-1]=right[i]*nums[i];
        }

        return res;
    }
}
