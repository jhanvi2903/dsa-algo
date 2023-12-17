public class SecondLargestElement {

    public static int secondLargestElement(int[] a){

        int largest=a[0];
        int secondLargest=-1;

        for(int i=1; i<a.length; i++){
           largest=Math.max(largest,a[i]);
        }

        for(int i=1; i<a.length; i++){
            if(largest!=a[i]){
                    secondLargest=Math.max(secondLargest,a[i]);
            }
        }

        return secondLargest;
    }

    public static void main(String[] args){
        int[] arr={10,10,10,10};
        System.out.println(secondLargestElement(arr));
    }
}
