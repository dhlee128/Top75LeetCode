package Binary.Counting_Bits;

//338. Counting Bits
public class Q338 {

    public static void main(String[] args) {
        int n=2;
        int[] res=countBits(n);
        System.out.println(res[0]+","+res[1]+","+res[2]);
    }

    public static int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=0;i<=n;i++){
            int count=0;
            for(int j=0;j<32;j++){
                if(((1 << j) & i) != 0) {
                    count++;
                }
            }
            res[i]=count;
        }
        return res;
    }
}
