class Solution {
    public int maxProfit(int[] prices) {
        int low =0, high = 1, n = prices.length;
        int ans = 0;

        while(high < n) {
            if(prices[high] <= prices[low]) {
                low = high;
            } else {
                ans = Math.max(prices[high] - prices[low], ans);
            }
            high++;
        }

        return ans;
    }
}
