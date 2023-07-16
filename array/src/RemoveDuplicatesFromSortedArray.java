import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicateElements(int[] arr) {

        int i=0;
        for(int j=1; j< arr.length; j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }

        return i+1;
    }
    public static void main(String[] args){
        int[] a={2,10,10,10,20,20,20,30,30};
        System.out.println(removeDuplicateElements(a));
    }
}
