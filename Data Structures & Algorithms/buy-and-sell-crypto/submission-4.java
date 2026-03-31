class Solution {
    public int maxProfit(int[] prices) {
        int low =0, high = 1, n = prices.length;
        int ans = 0;
  
        while(high < n) {
	     // Update left index if the prices are low or same as current
            if(prices[high] < prices[low]) {
                low = high;
            } else {
                // get the maximum difference
                ans = Math.max(prices[high] - prices[low], ans);
            }
            high++;
        }
  
        return ans;
    }
}