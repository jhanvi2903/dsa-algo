/*
https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
 */


import java.util.Arrays;

public class ReplaceElementsBruteForce {

        public static int[] replaceElements(int[] arr) {

            int curr_element;
            int maxElement = Integer.MIN_VALUE;
            for(curr_element=0;curr_element< arr.length-1;curr_element++) {
                maxElement = Integer.MIN_VALUE;
                for (int i = curr_element + 1; i < arr.length; i++) {
                    maxElement = Math.max(maxElement, arr[i]);
                }
                arr[curr_element] = maxElement;
            }

            arr[arr.length-1]=-1;
            
            return arr;
        }

        public static void main(String[] args){
            int[] arr={17,18,5,4,6,1};
            System.out.println(Arrays.toString(replaceElements(arr)));
        }

}
