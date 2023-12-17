public class ThirdLargestElement {

    public static int thirdLargestElement(int[] a){

        int firstLargest=a[0];
        int secondLargest=-1;
        int thirdLargest=-1;

        for(int i=0; i<a.length; i++){
            firstLargest=Math.max(firstLargest,a[i]);
        }

        for(int i=0; i<a.length; i++){
            if(firstLargest!=a[i]){
                secondLargest=Math.max(secondLargest,a[i]);
            }
        }

        for(int i=0; i<a.length; i++){
            if(firstLargest!=a[i] && secondLargest!=a[i]){
                thirdLargest=Math.max(thirdLargest, a[i]);
            }
        }

        return thirdLargest;
    }
    public static void main(String[] args){
        int[] arr={20,20,15,1};
        System.out.println(thirdLargestElement(arr));
    }
}
