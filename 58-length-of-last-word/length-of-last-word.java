class Solution {
    public int lengthOfLastWord(String s) {
        int wordLen = 0;
        boolean  fl = false;
        for(int i=s.length()-1;i >= 0;i--){
            if(s.charAt(i) == ' '){
                if(fl){
                    return wordLen;
                }
            }
            else{
                wordLen ++;
                fl = true;
            }
        }
        return wordLen;
    }
}