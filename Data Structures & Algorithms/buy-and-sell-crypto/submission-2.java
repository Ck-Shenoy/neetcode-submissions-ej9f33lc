class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;

        for(int i =0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(prices[i] < prices[j]) {
                    ans = Math.max(ans, prices[j]-prices[i]);
                }
            }
        }

        return ans;
    }
}
