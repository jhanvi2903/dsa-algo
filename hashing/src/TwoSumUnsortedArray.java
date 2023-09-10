import java.util.HashSet;

public class TwoSumUnsortedArray {

    public static void twoSum(int[] arr, int sum){

        HashSet<Integer> hashSet = new HashSet<>();

        for(int e : arr){
            if(hashSet.contains( sum-e)){
                System.out.println(e+ " "+ (sum-e));
            }else {
                hashSet.add(e);
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {6,3,2,5,0,8};
        int sum = 8;

        twoSum(arr, sum);
    }
}
