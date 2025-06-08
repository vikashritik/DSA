class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Arrays.sort(candyType); 

        int uniqueTypes = 1; 
        for (int i = 1; i < n; i++) {
            if (candyType[i] != candyType[i - 1]) {
                uniqueTypes++;
            }
        }
        return Math.min(uniqueTypes, n / 2);
    }
}
