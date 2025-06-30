class Solution {
public:
    int thirdMax(vector<int>& nums) {
        set<int>st;
        for(auto i : nums){
            st.insert(i);
        }
        int x = st.size() - 2;

        int ans = *max_element(nums.begin(),nums.end());

        
        for(auto it = st.begin() ;it != st.end() && x;it++){
            ans = *it;
            x--;
        }
        return ans;
    }
};