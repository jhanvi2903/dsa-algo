import java.util.Scanner;

public class ReverseNumber {

    public static int reverseNumber(int num){
        int reverse =0;

        while(num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        return reverse;

    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println( reverseNumber(num));
    }
}
