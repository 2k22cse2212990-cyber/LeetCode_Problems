class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        Map<Character, Integer> window = new HashMap<>();

        for (int right = 0; right < s2.length(); right++) {
            char ch = s2.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // If window size exceeds s1 length, remove left char
            if (right - left + 1 > s1.length()) {
                char remove = s2.charAt(left);
                window.put(remove, window.get(remove) - 1);
                if (window.get(remove) == 0) window.remove(remove);
                left++;
            }

            // Compare both maps
            if (window.equals(mp)) return true;
        }

        return false;
    }
}
