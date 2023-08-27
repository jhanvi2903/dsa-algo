public class MaximumSumCircularSubArray {

    public static int maximumSum(int arr[]){

        int result=arr[0];

        for(int i=0;i< arr.length;i++) {
            int maxSum = arr[i];
            int currSum = arr[i];

            for (int j = 1; j < arr.length; j++) {
                currSum = currSum+arr[(i+j)% arr.length];
                maxSum = Math.max(maxSum, currSum);
            }
            result=Math.max(result,maxSum);
        }

        return result;
    }

    public static void main(String[] args){
        int arr[]={8,1,-2,-3,-1,2};
        System.out.println(maximumSum(arr));

    }
}
