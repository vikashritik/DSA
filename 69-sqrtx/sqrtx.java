class Solution {
    public int mySqrt(int n) {
        int ans = 0;
        for(long i=1; i<=(long)n; i++){
            if(i*i <= (long)n){
                ans = (int)i;
            }
            else{
                break;
            }
        }
        return ans;
    }
} 