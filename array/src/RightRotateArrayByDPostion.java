/*
https://leetcode.com/problems/rotate-array/description/

Consider below test cases-
1]I/P-{1,2}, k=3
  O/P-{2,1}

2]I/P-{-1}, k=3
  O/P-{-1}

3]I/P-{1,2,3,4,5,6,7}, k=3
  O/P-{5,6,7,1,2,3,4}
 */


import java.util.Arrays;

public class RightRotateArrayByDPostion {
    public static int[] rotate(int[] nums, int k) {
        int n=nums.length;
         k=k%n;
        reverse(nums,n-1,n-k);
        reverse(nums,n-1-k,0);
        reverse(nums,n-1,0);

        return nums;

    }

    static void reverse(int[] nums, int high, int low){
        while(high>low){
            int temp;
            temp=nums[high];
            nums[high]=nums[low];
            nums[low]=temp;
            low++;
            high--;
        }


    }

    public static void main(String[] args){
        int[] arr={1,2};
        int k=3;
        System.out.println(Arrays.toString(rotate(arr,k)));
    }

}


