class Solution {
    public int lengthOfLastWord(String s) {
        int word_length = 0;
        s = s.trim();
        for (int i = s.length()-1; i >= 0; i--) {
        if (s.charAt(i) != ' ') {
            word_length += 1;
            
        }
        else{
            break;
        }
        }
        return word_length;
    }
}
