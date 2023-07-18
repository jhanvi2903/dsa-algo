/*
https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
 */



import java.util.Arrays;

public class ReplaceElementsOptimizedSolution {

    public static int[] replaceElements(int[] arr) {

        int maxElement = -1, tempStoreCurrentElement;

        for (int i = arr.length - 1; i >= 0; --i) {
            tempStoreCurrentElement = arr[i];
            arr[i] = maxElement;
            maxElement = Math.max(maxElement, tempStoreCurrentElement);
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr={17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
