class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int initialValue = 0;
        for (String str : operations) {
            if (str.equals("--X")  ||  str.equals("X--")) initialValue--;
            else initialValue++;
        }

        return initialValue;
    }
}