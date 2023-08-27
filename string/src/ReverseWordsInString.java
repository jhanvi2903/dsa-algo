public class ReverseWordsInString {

    public static char[] reverseString(String s){

        char[] c= s.toCharArray();
        int start=0;
        int end;

        for(end=0;end<c.length;end++){
            if(c[end]==' '){
               reverseWord(c,start,end-1);
               start=end+1;
            }
        }

        reverseWord(c,start,end-1);
        reverseWord(c,0,end-1);

      return c;
    }
    public static void reverseWord(char[] ch, int low, int high){
        char temp;
        while(low<high){
           temp=ch[low];
           ch[low]=ch[high];
           ch[high]=temp;
           low++;
           high--;
        }
    }



    public static void main(String[] args){
        String s = "What really matters is never giving up";
        System.out.println(reverseString(s));
    }
}
