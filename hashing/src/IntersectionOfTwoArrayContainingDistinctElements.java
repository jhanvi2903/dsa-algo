//Display intersection of 2 arrays where elements should be arranged in ascending order

import java.util.HashSet;

public class IntersectionOfTwoArrayContainingDistinctElements {

    public static void intersectionArray(int[] arr1, int[] arr2){

        HashSet<Integer> hashSet= new HashSet<>();

        for(Integer e: arr2){
            hashSet.add(e);
        }

        for(int i=0; i<arr1.length; i++){
            if(hashSet.contains(arr1[i])){
                System.out.println(arr1[i]);
            }
        }
    }

    public static void main(String[] args){
        int[] arr1 ={1,3,7,8};
        int[] arr2={3,8};

        intersectionArray(arr1,arr2);
    }
}
