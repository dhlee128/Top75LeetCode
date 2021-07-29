package Array.Maximum_Product_Subarray;

//152. Maximum Product Subarray
public class Q152 {

    public static void main(String[] args) {
        int[] nums={-2,3,-4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {

        int min=nums[0];
        int max=nums[0];
        int res=nums[0];
        int len=nums.length;

        for(int i=1;i<len;i++){
            int temp=min;
            min=Math.min(Math.min(max*nums[i],min*nums[i]),nums[i]);//-6 -12
            max=Math.max(Math.max(max*nums[i],temp*nums[i]),nums[i]);//3 24
            res=Math.max(res,max);
        }

        return res;
    }
    public static int maxProduct2(int[] nums) {

        int min=nums[0];
        int max=nums[0];
        int res=nums[0];
        int len=nums.length;

        for(int i=1;i<len;i++){
            if(nums[i]>0){
                max=Math.max(max*nums[i],nums[i]);
                min=Math.min(min*nums[i],nums[i]);
            }else{
                int temp=max;
                max=Math.max(min*nums[i],nums[i]);
                min=Math.min(temp*nums[i],nums[i]);
            }
            res=Math.max(res,max);
        }

        return res;
    }
}
