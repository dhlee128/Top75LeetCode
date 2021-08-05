package Binary.Sum_of_TwoIntegers;

//371. Sum of Two Integers
public class Q371 {

    public static void main(String[] args) {
        int a=2; int b=3;
        System.out.println(getSum2(a,b));
    }

    static int sum;
    public static int getSum(int a, int b) {
        if(b==0) return a;
        sum=getSum(a^b,(a&b)<<1);

        return sum;
    }

    public static int getSum2(int a, int b) {
        if (b == 0) return a;
        return getSum2(a ^ b, (a & b) << 1);
    }
}
