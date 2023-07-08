
/*
    Consider the ArrayIndexOutOfBoundException in Array questions
    The below solution will throw this exception in if condition  -
      for(int i=1; i<a.length; i++){
           if(a[i] > a[i+1]){
               return 0;
           }
       }
 */
public class CheckSortedArray {
    public static int isSorted(int n, int []a) {

        for(int i=1; i<a.length; i++){
            if(a[i-1] > a[i]){
                return 0;
            }
        }

        return 1;
    }
}
