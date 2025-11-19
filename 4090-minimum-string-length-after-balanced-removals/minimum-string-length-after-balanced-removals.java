class Solution {
    public int minLengthAfterRemovals(String s) {
        int cntA = 0, cntB = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a') cntA++;
            else cntB++;
        }

        return Math.abs(cntA - cntB);
    }
}