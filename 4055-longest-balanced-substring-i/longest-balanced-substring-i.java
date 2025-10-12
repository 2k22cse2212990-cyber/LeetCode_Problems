class Solution {
    public int longestBalanced(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] mp = new int[26];
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                mp[ch - 'a']++;
                int max = 0, min = Integer.MAX_VALUE;
                for (int freq : mp) {
                    if (freq > 0) {
                        max = Math.max(freq, max);
                        min = Math.min(freq, min);
                    }
                }
                if (max == min) maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}