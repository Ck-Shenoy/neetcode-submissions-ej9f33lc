class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0, right = n-1, ans = -1;

        while(left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int area = height * width;

            ans = Math.max(ans, area);

            if(heights[left] <= heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
}
