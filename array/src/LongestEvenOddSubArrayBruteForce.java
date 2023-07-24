public class LongestEvenOddSubArrayBruteForce {

    public static int evenOdd(int[] arr){

        int maxLength=1;
        for(int i=0; i< arr.length; i++){
            int count =1;
            for (int j=i+1;j< arr.length;j++){
                if((arr[j-1]%2==0 && arr[j]%2!=0) || (arr[j-1]%2!=0 && arr[j]%2==0)){
                    count++;
                }else {
                    break;
                }
                maxLength=Math.max(maxLength,count);
            }
        }

        return maxLength;
    }



    public static void main(String[] args){
        int[] arr={5,10,20,6,3,8};
        System.out.println(evenOdd(arr));


    }
}
