import java.util.HashSet;

public class UnionOfUnsortedArray {

    public static void unionUnsortedArray(int[] arr1, int[] arr2){

        HashSet<Integer> hashSet = new HashSet<>();

        for(int e : arr1){
            hashSet.add(e);
        }

        for(int e1 : arr2){
            hashSet.add(e1);
        }

        System.out.println(hashSet.size());
    }

    public static void main(String[] args){

        int[] arr1 = {2,6,1,5,3,8,4};
        int[] arr2 = {8,9,4,9,7};

        unionUnsortedArray(arr1, arr2);
    }
}
