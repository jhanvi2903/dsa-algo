import java.util.Arrays;

public class ThreeSumPair {

    public static void threeSum(int[] nums, int target){

        Arrays.sort(nums);
        for(int i=0;i< nums.length-3;i++){
            int low=i+1;
            int high= nums.length-1;
            int key=target-nums[i];

            while (low<high){
                if(key<nums[low]+nums[high]){
                    high--;
                } else if (key>nums[low]+nums[high]) {
                    low++;
                }else {
                    System.out.println(nums[i]+" , "+nums[low]+" , "+nums[high]);
                    low++;
                    high--;
                }

            }
        }
    }

    public static void main(String[] args){
        int[] nums = { 2, 7, 4, 0, 9, 5, 1, 3 };
        int target = 6;

        threeSum(nums,target);
    }
}
