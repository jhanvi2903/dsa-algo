import java.util.HashSet;

public class RemoveDuplicatesFromUnsortedArray {

    public static void removeDuplicates(int[] arr){

        HashSet<Integer> hashSet=new HashSet<>();

        for(int i=0; i< arr.length; i++){
            hashSet.add(arr[i]);
        }

        for(Integer i:hashSet){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        int[] arr={1,3,7,6,3,1,5};
        removeDuplicates(arr);

    }
}
