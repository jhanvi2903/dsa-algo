public class DigitCountOfFactor {

    static int evenlyDivides(int N){

        int count=0;
        int y=N;
        while(N!=0){
            int rem=N%10;

            if(rem!=0 && y%rem==0){
                count++;
            }
            N=N/10;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(evenlyDivides(113));
    }
}
