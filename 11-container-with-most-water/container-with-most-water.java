class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int res = 0;

        while (i < j) {
            int currArea = (j - i) * Math.min(height[i], height[j]);
            if (height[i] <= height[j]) i++;
            else  if (height[i] > height[j]) j--;

            res = Math.max(res, currArea);
        }

        return res;
    }
}