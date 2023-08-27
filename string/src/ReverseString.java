public class ReverseString {

    public static <Char> void reverseString(String s){


        char[] ch=s.toCharArray();
        int left;
        int right=ch.length-1;
        char temp;

        for(left=0; left<right; left++,right--){
            temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
        }

        for(char c:ch){
            System.out.print(c);
        }


    }

    public static void main(String[] args){
        String s="Jhanvi is intelligent";
        reverseString(s);

    }
}
