public class SubsequenceInString {

    public static boolean checkSubsequence(String s1, String s2, int s1Length,int s2Length){

        int j=0;
        for(int i=0; i<s1Length && j<s2Length; i++ ){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }

        return s2Length==j;
    }

    public static void main(String[] args){
        String s1= "ABCDE";
        String s2="ACDE";
        boolean result=checkSubsequence(s1,s2,s1.length(),s2.length());
        System.out.println(result);
    }
}
