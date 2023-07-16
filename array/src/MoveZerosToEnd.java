import java.util.Arrays;

public class MoveZerosToEnd {

    public static int[] moveZeroes(int[] nums) {

        int i=0;
        int temp;
        for(int j=0;j<nums.length; j++){
            if(nums[j]!=0){
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }

        return nums;
    }

    public static void main(String[] args){
        int[] a={1,0,1};
        System.out.println(Arrays.toString(moveZeroes(a)));
    }
}
