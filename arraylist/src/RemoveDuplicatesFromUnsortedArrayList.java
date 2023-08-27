import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromUnsortedArrayList {

    public static void removeDuplicates(ArrayList<Integer> arrayList){

        HashSet<Integer> hashSet=new HashSet<>();

        for(Integer i:arrayList){
            hashSet.add(i);
        }

        for (Integer i: hashSet){
            System.out.print(i+" ");
        }

    }

    public static void main(String[] args){
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(2);
        removeDuplicates(arrayList);
    }
}
