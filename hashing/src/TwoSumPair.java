import java.util.HashMap;

public class TwoSumPair {

    public static void twoSum(int[] nums, int target){

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int i=0; i< nums.length;i++){
            if(hashMap.containsKey(target-(nums[i]))){
                System.out.println("Pair found: "+hashMap.get(target-nums[i])+" , "+nums[i]);

            }
            hashMap.put(nums[i],nums[i]);
        }
    }

    public static void main(String[] args){
        int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 10;
        twoSum(nums, target);

    }
}
