class Solution {
    public int scoreOfParentheses(String s) {
        int res = 0;
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == '(') depth++;
            else {
                char prevChar = s.charAt(i - 1);
                depth--;
                if (prevChar == '(') res += 1 << depth;
            }
        }
        return res;
    }
}