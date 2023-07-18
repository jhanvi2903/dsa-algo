/*
https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/
 */

public class MaxDiffIncreasingElement{
    public static int maximumDifference(int[] nums) {

        int max=-1;
        int difference;

        for(int i=0; i<nums.length-1; i++){
            for(int j=1+i; j< nums.length; j++){
                if(nums[i]<nums[j]){
                    difference= nums[j]-nums[i];
                    max=Math.max(max,difference);
                }
            }
        }

        return max;
    }

    public static void main(String[] args){
        int[] arr={9,4,3,2};
        System.out.println(maximumDifference(arr));
    }
}