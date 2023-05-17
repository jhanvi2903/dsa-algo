public class Palindrome {

    public static int reverseNumber(int num){

        int reverse=0;

        while(num!=0){
            int rem=num%10; //Extract the last digit
            reverse=reverse*10+rem; //Appending last digit
            num=num/10; // Shrinking num by discarding the last digit
        }

        return reverse;
    }

    public static void main(String[] args){
        int num= 1221;
        int dummy = num;
        int checkPalindrome= reverseNumber(num);
        if(dummy==checkPalindrome){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}
