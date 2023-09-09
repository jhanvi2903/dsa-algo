// Display the distinct element of the intersection of 2 arrays which contains duplicates

import java.util.HashSet;

public class IntersectionOfTwoArrayDuplicateElementsDisplayDistinct {

    public static void intersectDisplayDistinct(int[] arr1, int[] arr2){

        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet1 = new HashSet<>();

        for(Integer e: arr1){
            hashSet.add(e);
        }

        for(Integer e1 : arr2){
            if(hashSet.contains(e1)){
                hashSet1.add(e1);
            }
        }

        for(Integer e2 : hashSet1){
            System.out.println(e2);
        }

    }

    public static void main(String[] args){
        int[] arr1={2,4,1,2,4,6,2};
        int[] arr2={2,1,2,2,4};
        intersectDisplayDistinct(arr1, arr2);
    }
}
