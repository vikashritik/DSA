class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int cur = nums[0];
        int vote = 0;

        for(auto i : nums){
            if(cur == i){
                vote ++;
            }
            else{
                vote --;
            }
            if(vote == 0){
                cur = i;
                vote = 1;
            }
        }
        return cur;
    }
};