import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.

        int i=0;
        List<Integer> list = new ArrayList<>();
        for(int j=1; j<a.length; j++){
            if(a[i]<a[j]){
                i++;
            } else if (a[i]>a[j]) {
                list.add(a[i]);
                if(a[j]==a[a.length-1]){
                    list.add(a[j]);
                }
            }

        }
        return list;
    }
    public static void main(String[] args){
        int arr[] ={1,2,3,2};
        System.out.println(superiorElements(arr));
    }
}
