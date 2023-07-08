/*
https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length]
*/

public class CheckArrayIsSortedAndRotated {

    public boolean check(int[] nums) {

        int irregular=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > nums[(i+1) % nums.length]){
                irregular++;
            }
        }

        return irregular <= 1;
    }
}
