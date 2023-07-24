/*
subarray- It is the array of contiguous elements
for example-
I/P Array- {1,4,5}
O/P SubArrays of Array- {1},{4},{5},{1,4},{4,5},{1,4,5}

Find the subarray from array with the highest sum
for example-
I/P-{1,-2,3,-1,2}
O/P- 4
explanation - The subarray with the highest sum is {3,-1,2}=4

Time Complexity = O(n^2)
Space Complexity = O(1)
 */



public class MaximumSumSubarrayBruteForce {

    public static int maximumSum(int arr[]){
        int maxSum=arr[0];

        for(int i=0; i< arr.length;i++){
            int curr=0;
            for(int j=i;j< arr.length;j++){
                curr=curr+arr[j];
                maxSum=Math.max(maxSum,curr);
            }
        }

        return maxSum;

    }

    public static void main(String[] args){
        int arr[]={1,-2,3,-1,2};
        System.out.println(maximumSum(arr));

    }
}
