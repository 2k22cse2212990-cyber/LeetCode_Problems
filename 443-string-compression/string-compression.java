class Solution {
    public int compress(char[] chars) {
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i < chars.length) {
            char ch = chars[i];
            int j = i;
            while (j < chars.length && chars[j] == ch) {
                j++;
            }
            int freq = j - i;
            sb.append(ch);
            if (freq > 1) sb.append(freq);
            i = j;
        }
        
        for (int k = 0; k < sb.length(); k++) {
            chars[k] = sb.charAt(k);
        }

        return sb.length();
    }
}
