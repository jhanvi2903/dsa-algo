import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfArrayElements {

    public static void frequenciesOfElement(int[] arr){

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(Integer e : arr){
            hashMap.put(e,hashMap.getOrDefault(e,0)+1);
        }

        for (Map.Entry<Integer,Integer> map : hashMap.entrySet()){
            System.out.println("Element "+map.getKey()+" appeared  "+map.getValue()+ " times");
        }
    }

    public static void main(String[] args){
        int arr[] ={10,30,20,10,30,20,10,30,50,40};
        frequenciesOfElement(arr);
    }
}
