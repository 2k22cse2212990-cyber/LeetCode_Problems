class Solution {
    public int minDeletion(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int deletions = 0;
        st.push(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (st.size() % 2 == 0) {
                st.push(nums[i]);
            } else {
                if (st.peek() == nums[i]) {
                    deletions++;
                } else {
                    st.push(nums[i]);
                }
            }
        }

        if (st.size() % 2 != 0) deletions++;
        return deletions;
    }
}