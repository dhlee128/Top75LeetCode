package Array.Container_With_Most_Wate;

//11. Container With Most Water
public class Q11 {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(true){
           max=Math.max(max,(right-left)*Math.min(height[left],height[right]));
           if(height[left]<height[right]){
               left++;
           }else{
               right--;
           }
           if(left==right) break;
        }
        return max;
    }
}
