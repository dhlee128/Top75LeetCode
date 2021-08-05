package Binary.Number_of_1_Bits;

//191. Number of 1 Bits
public class Q191 {

    public static void main(String[] args) {
        int n=00000000000000000000000000001011;
        System.out.println(hammingWeight(n));

    }
    public static int hammingWeight(int n) {
        int count=0;
        int len=Integer.toBinaryString(n).length();
        for(int i=0;i<len;i++){
            if(((1 << i) & n) == (1 << i)) {
                count++;
            }
        }
        return count;
    }

    public static int hammingWeight2(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            if(((1 << i) & n) != 0) {
                count++;
            }
        }
        return count;
    }

    public static int hammingWeight3(int n) {
        return Integer.bitCount(n);
    }
}
