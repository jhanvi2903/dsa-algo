public class Palindrome {

    public static int reverseNumber(int num){

        int reverse=0;

        while(num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }

        return reverse;
    }

    public static void main(String[] args){
        int num= 1221;
        int checkPalindrome= reverseNumber(num);
        if(num==checkPalindrome){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}
