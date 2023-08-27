import java.util.HashMap;
import java.util.Map;

//Using hashmap or hashset
public class FindTheDuplicatesfromUnsortedArray {

    public static void removeDuplicates(int[] arr){

        HashMap<Integer,Integer> hashMap=new HashMap();

        for(int i=0; i< arr.length; i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> map: hashMap.entrySet()){
            if(map.getValue()>1){
                System.out.print(map.getKey()+" ");
            }
        }

    }

    public static void main(String[] args){
        int[] arr={2,6,5,1,6,2};
        removeDuplicates(arr);
    }
}
