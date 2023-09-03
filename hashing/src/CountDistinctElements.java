import java.util.HashSet;

public class CountDistinctElements {

    public static void countDistinct(int[] arr){

        HashSet<Integer> hashSet= new HashSet<>();

        for(int i=0; i< arr.length; i++){
            hashSet.add(arr[i]);
        }

        for (Integer i:hashSet){
            System.out.println(i);
        }



    }

    public static void main(String[] args){
        int[] arr={20,10,20,10,30};
        countDistinct(arr);
    }
}
