import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysDisplayDuplicates {

    private static void intersectDisplayDuplicates(int[] arr1, int[] arr2) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (Integer e : arr1){
            hashMap.put(e, hashMap.getOrDefault(e,0)+1 );
        }

        for(Integer e1 : arr2){
            if(hashMap.containsKey(e1) && hashMap.get(e1)>0){
                arrayList.add(e1);
                hashMap.put(e1, hashMap.get(e1)-1);
            }
        }

        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
    public static void main(String[] args){
        int[] arr1={2,4,6,2,1,1};
        int[] arr2={2,1,4,2,4,7};
        intersectDisplayDuplicates(arr1, arr2);
    }
}
