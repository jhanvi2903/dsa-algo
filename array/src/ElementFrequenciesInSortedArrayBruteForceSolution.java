
/*
Time Complexity= O(nlongn)
 */

import java.util.HashMap;
import java.util.Map;

public class ElementFrequenciesInSortedArrayBruteForceSolution {

    public static void elementFrequencies(int[] arr){

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int i=0; i< arr.length; i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer,Integer> mp: hashMap.entrySet()){
            System.out.println(mp.getKey()+" "+ mp.getValue());
        }
    }

    public static void main(String[] args){
      int arr[]={10,10,10,25,25,30};
        elementFrequencies(arr);
    }
}
