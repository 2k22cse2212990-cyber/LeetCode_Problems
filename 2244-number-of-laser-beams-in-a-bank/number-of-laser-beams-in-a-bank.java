class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0;
        int prevCnt = 0;
        for (String str : bank) {
            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    cnt++;
                }
            }
            res += prevCnt * cnt;
            if (cnt > 0) prevCnt = cnt;

        }

        return res;
    }
}