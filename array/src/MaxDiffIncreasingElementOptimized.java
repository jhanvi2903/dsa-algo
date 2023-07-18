/*
https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/
 */

public class MaxDiffIncreasingElementOptimized {

    public static int maximumDifference(int[] nums) {

        int max=-1;
        int min=nums[0];

        for (int i=1; i< nums.length; i++){
            if(min<nums[i]){
                max = Math.max(max, nums[i]-min);
            }else{
                min = Math.min(min,nums[i]);
            }
        }

        return max;

    }



    public static void main(String[] args){
        int[] arr={9,4,3,2};
        System.out.println(maximumDifference(arr));
    }
}
