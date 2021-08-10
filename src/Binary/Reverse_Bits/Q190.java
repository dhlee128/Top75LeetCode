package Binary.Reverse_Bits;

//190. Reverse Bits
public class Q190 {


    public static int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++) {
            if((n&(1<<i))!=0) res+=(1<<(31-i));
        }
        return res;
    }

    public static void main(String[] args) {
        int n=43261596;
        System.out.println(reverseBits(n));
    }

}
