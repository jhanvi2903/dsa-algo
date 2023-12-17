public class ThirdLargestElementOptimized {

    public static int thirdLargest(int[] a){

        int firstLargest=a[0];
        int secondLargest=-1;
        int thirdLargest=-1;

        for(int i=1; i<a.length; i++){
            if(firstLargest<a[i]){
                thirdLargest=secondLargest;
                secondLargest=firstLargest;
                firstLargest=a[i];
            } else if (secondLargest<a[i] && secondLargest!=-1) {
                thirdLargest=secondLargest;
                secondLargest=a[i];
            } else if (thirdLargest<a[i] && thirdLargest!=-1) {
                thirdLargest=a[i];
            }
        }

        return thirdLargest;
    }

    public static void main(String[] args){
        int[] arr={5,2,10,9,8,7,11};
        System.out.println(thirdLargest(arr));
    }
}
