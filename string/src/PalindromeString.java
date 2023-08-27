public class PalindromeString {

    public static boolean checkPalindrone(String s){

        ;
        int left;
        int right = s.length()-1;

        for(left=0; left<right; left++, right--){
            if(s.charAt(left)!= s.charAt(right)){
                return false;

            }
        }

       return true;

    }

    public static void main(String[] args){
        String s ="abbacd";
        System.out.println(checkPalindrone(s));


    }
}
