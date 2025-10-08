class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pairs = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            int start = 0, end  = potions.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                long strength = (long)spell * potions[mid];
                if (strength >= success) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (start < potions.length) pairs[i] = potions.length - start;
            
        }
        return pairs;
    }
}
