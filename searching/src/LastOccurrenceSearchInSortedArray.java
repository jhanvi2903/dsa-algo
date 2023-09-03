public class LastOccurrenceSearchInSortedArray {

    public static int lastOccurrenceSearch(int[] arr, int x){

        int low = 0;
        int high= arr.length-1;
        int mid;

        if(low>high){
            return -1;
        }

        while (low<=high){
             mid = (low+high)/2;

            if(x < arr[mid]){
                high=mid-1;
            } else if (x > arr[mid]) {
                low=mid+1;
            }else{
                if(mid== arr.length-1 || arr[mid+1]!=arr[mid]){
                    return mid;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[]={5,10,10,10,10,20,20};
        int searchLastElement=20;
        System.out.println(lastOccurrenceSearch(arr,searchLastElement));
    }
}
