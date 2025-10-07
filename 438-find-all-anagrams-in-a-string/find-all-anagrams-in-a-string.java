class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        int k = p.length();

        char[] arr = p.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i <= n - k; i++) {
            String str = s.substring(i, i + k);
            char[] arr1 = str.toCharArray();
            Arrays.sort(arr1);
            if (Arrays.equals(arr, arr1)) res.add(i);
        }

        return res;
    }
}