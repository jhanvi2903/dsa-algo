public class MaximumSumSubArrayOptimzedSolution {

    private static int maximumSum(int[] arr) {
        int max=arr[0];
        int maxEnding=arr[0];

        for(int i=1; i< arr.length; i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            max=Math.max(max,maxEnding);
        }

        return max;
    }
    public static void main(String[] args){
        int arr[]={-4,-2,-3};
        System.out.println(maximumSum(arr));

    }


}
