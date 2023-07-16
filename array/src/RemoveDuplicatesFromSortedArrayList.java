import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArrayList {
    public static int removeDuplicatesElements(ArrayList<Integer> arr) {
        // Write your code here.

        int i=0;
        for(int j=1; j<arr.size(); j++){
            if(arr.get(i)!=arr.get(j)){
                i++;
                arr.set(i,arr.get(j));
            }
        }

        return i+1;
    }

    public static void main(String[] args){
       ArrayList<Integer> arr=new ArrayList<>();
       arr.add(2);
       arr.add(10);
       arr.add(10);
       arr.add(20);
        System.out.println(removeDuplicatesElements(arr));
    }
}