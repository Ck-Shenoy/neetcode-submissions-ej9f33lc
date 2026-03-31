class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, low =0, high = 0, n = s.length();

        for(int i=0; i<n; i++) {
            Set<Character> st = new HashSet<>();
            for(int j=i; j<n; j++) {
                char ch = s.charAt(j);
                if(st.contains(ch)) {
                    break;
                }
                st.add(ch);
                ans=Math.max(ans, st.size());
            }
        }

        return ans;
    }
}
