/*
https://leetcode.com/problems/trapping-rain-water/description/
 */
public class TrappingRainWater {

    public static int trap(int[] height) {

        int result = 0;
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];

        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        rightMax[rightMax.length - 1] = height[height.length - 1];
        for (int i = rightMax.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        for (int i = 1; i < height.length - 1; i++) {
            result += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        System.out.println(trap(arr));
    }
}
