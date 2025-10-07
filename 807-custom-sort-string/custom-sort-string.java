class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()) mp.put(ch, mp.getOrDefault(ch, 0) + 1);

        StringBuilder sb = new StringBuilder();
        for (char ch : order.toCharArray()) {
            if (mp.containsKey(ch)) {
                int count = mp.get(ch);
                for (int i = 0; i < count; i++) sb.append(ch);
            }
            mp.remove(ch);
        }

        for (char ch : mp.keySet()) {
            int count = mp.get(ch);
            for (int i = 0; i < count; i++) sb.append(ch);
        }

        return sb.toString();
    }
}