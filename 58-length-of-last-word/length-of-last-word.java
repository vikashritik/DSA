class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
       while(i>=0 && s.charAt(i)==' '){
        i--;
       }
       int word_length=0;
       while(i>=0 && s.charAt(i)!=' '){
          word_length++;
          i--;
       }
        return word_length;
    }
}