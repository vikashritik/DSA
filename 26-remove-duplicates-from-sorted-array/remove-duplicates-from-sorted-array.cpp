class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        map<int,int>mp;
        for(auto i : nums){
            mp[i] ++;
        }
        int i = 0;
        for(auto [a,b] : mp){
            nums[i++]  = a;
        }
        return i;
    }
};