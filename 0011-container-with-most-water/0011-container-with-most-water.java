class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            // Width
            int width = right - left;

            // Chhoti wall ki height
            int currentHeight = Math.min(height[left], height[right]);

            // Current container ka area
            int currentArea = width * currentHeight;

            // Maximum area update
            maxArea = Math.max(maxArea, currentArea);

            // Chhoti wall ko move karo
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}