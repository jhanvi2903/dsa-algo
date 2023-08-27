public class ReverseBits {

    static void decimalToBinary(int n){

        int[] b=new int[32];
        int i=0;
        while(n>0){
            b[i]=n % 2;
            n=n/2;
            i++;
        }

//        int j=0;
//        while(i<32) {
//            b[j]=b[i];
//        }

        for( int j=i-1;j>=0;j--){
            System.out.println(b[j]);
        }

    }

    public static void main(String[] args){
        decimalToBinary(5);
    }
}
