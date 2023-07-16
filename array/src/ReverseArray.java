import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] a){

        int first;
        int last=a.length-1;
        int temp;

        for(first=0; first<last; first++){
            temp=a[last];
            a[last]=a[first];
            a[first]=temp;
            last--;
        }

        return a;
    }


    public static void main(String[] args){
        int[] arr = {2,3,10,4,6};
        int[] a=reverseArray(arr);
        System.out.println(Arrays.toString(a));

    }
}
