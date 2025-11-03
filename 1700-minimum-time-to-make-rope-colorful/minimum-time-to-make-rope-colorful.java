class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res = 0;
        int index = 0;

        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(index)) {
                res += Math.min(neededTime[index], neededTime[i]);
                neededTime[i] = Math.max(neededTime[i], neededTime[index]);
            }
            index++;
        }

        return res;
    }
}