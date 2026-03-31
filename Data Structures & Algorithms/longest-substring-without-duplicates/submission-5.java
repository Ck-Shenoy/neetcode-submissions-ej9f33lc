class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int ans = 0, low =0, high = 0;

        while(high < s.length()) {
            char ch = s.charAt(high);

            while(st.contains(ch)) {
                st.remove(s.charAt(low));
                low++;
            }

            ans = Math.max(ans, high - low + 1);
            st.add(ch);
            high++;
        }

        return ans;
    }
}
