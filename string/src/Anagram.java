import java.util.Arrays;

public class Anagram {

    public static boolean checkAnagram(String s1, String s2){

        char[] a1=s1.toCharArray();
        Arrays.sort(a1);
        String ss1=new String(a1);

        char[] a2=s2.toCharArray();
        Arrays.sort(a2);
        String ss2=new String(a2);

        return ss1.equals(ss2);
    }

    public static void main(String[] args){
        String s1="aabbbcd";
        String s2="bbbacda";
        Boolean result=checkAnagram(s1,s2);
        System.out.println(result);
    }
}
