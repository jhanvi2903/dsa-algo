/* secondLargest is assigned to -1 by assuming that there could be a possibility that
 all the elements are same and considered to be the largest, in this case there will be no
 second-largest element present in it
 */

public class SecondLargestElementOptimized {

    public static int secondLargest(int[] a){

        int largest=a[0];
        int secondLargest=-1;

        for(int i=0; i<a.length; i++){
            if(largest<a[i]){
                secondLargest=largest;
                largest=a[i];
            } else if (secondLargest<a[i] && secondLargest!=-1) {
                secondLargest=a[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args){
        int[] arr={5,2,10,9,8};
        System.out.println(secondLargest(arr));
    }
}
