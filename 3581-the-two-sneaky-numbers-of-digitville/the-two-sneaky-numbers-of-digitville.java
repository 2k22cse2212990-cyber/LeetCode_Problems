class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];

        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) mp.put(num, mp.getOrDefault(num, 0) + 1);

        int index = 0;
        for (int key : mp.keySet()) {
            if (mp.get(key) > 1) res[index++] = key;
        }

        return res;

    }
}