public class LongestEvenOddArrayOptimizedSolution {

    public static int evenOdd(int[] arr){
        int count=1;
        int maxLength=1;

        for(int i=1; i< arr.length; i++){
            if((arr[i-1]%2==0 && arr[i]%2!=0)||(arr[i-1]%2!=0 && arr[i]%2==0)){
                count++;
                maxLength=Math.max(maxLength,count);
            }else{
                count=1;
            }
        }
        return maxLength;
    }

    public static void main(String[] args){
        int[] arr={5,10,20,6,3,8};
        System.out.println(evenOdd(arr));

    }
}
