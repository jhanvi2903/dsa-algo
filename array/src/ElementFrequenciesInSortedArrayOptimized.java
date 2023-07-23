/*
Time Complexity=O(n)
 */

public class ElementFrequenciesInSortedArrayOptimized {

    public static void main(String[] args){
        int arr[]={10,10,10,25,25,30,30,40,40,40,40};
        elementFrequencies(arr);
    }

    private static void elementFrequencies(int[] arr) {

        int i=1;
        int frequency=1;
        while(i< arr.length){
            while(i< arr.length && arr[i]==arr[i-1]){
                i++;
                frequency++;
            }
            System.out.println(arr[i-1]+" "+frequency);
            i++;
            frequency=1;
        }

        if(arr[arr.length-1]!= arr[arr.length-2])
        System.out.println(arr[i-1]+" "+1);

    }
}
