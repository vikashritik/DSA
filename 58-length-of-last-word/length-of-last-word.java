class Solution {
    public int lengthOfLastWord(String s) {
        int word_length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                word_length++;
            } else if (word_length > 0) {
                break;
            }
        }
        return word_length;
    }
}
