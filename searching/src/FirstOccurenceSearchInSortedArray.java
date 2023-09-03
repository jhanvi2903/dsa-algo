//Efficient code(Iterative Solution)

public class FirstOccurenceSearchInSortedArray {

    public static int firstOccurrenceSearch(int arr[], int X){
          int low=0;
          int high= arr.length-1;
          int mid;

          while (low<=high) {

              mid = (low + high) / 2;

              if(X<arr[mid]){
                  high=mid-1;
              } else if (X>arr[mid]) {
                  low=mid+1;
              }else{
                  if(mid==0 || arr[mid-1]!=arr[mid]){
                      return mid;
                  }else{
                      high=mid-1;
                  }
              }

          }
          return -1;
    }

    public static void main(String[] args){
        int arr[]={5,10,10,11,15,15,15,19,20,20,20,20};
        int key=6;
        System.out.println(firstOccurrenceSearch(arr,key));
    }
}
