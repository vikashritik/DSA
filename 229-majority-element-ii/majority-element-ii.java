class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums); // Sort the array
        List<Integer> result = new ArrayList<>();
        
        int n = nums.length;
        int i = 0;
        
        while (i < n) {
            int count = 1;
            int current = nums[i];
            i++;
            
            // Count how many times current element occurs
            while (i < n && nums[i] == current) {
                count++;
                i++;
            }
            
            if (count > n / 3) {
                result.add(current);
            }
        }
        
        return result;
    }
}
