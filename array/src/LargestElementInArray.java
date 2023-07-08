
//https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?leftPanelTab=0

public class LargestElementInArray {
    static int largestElementSolution1(int[] arr, int n) {

        int maxNumber = arr[0];

        for(int i=1; i<arr.length; i++){
            if(maxNumber < arr[i]){
                maxNumber = arr[i];
            }
        }

        return maxNumber;
    }

    static int largestElementSolution2(int[] arr, int n) {

        int maxNumber = arr[0];

        for(int i=1; i<arr.length; i++){
            maxNumber = Math.max(maxNumber,arr[i]);
        }

        return maxNumber;
    }

    public static void main(String[] args){
        int arr[] = {4,8,9,1,2,17};
        System.out.println(largestElementSolution2(arr,arr.length));
    }
}
