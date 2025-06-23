class Solution {
    public int searchInsert(int[] arr, int target) {
      int mid, start=0, end=arr.length-1,index=0;
      while(start<=end){
        mid=end+(start-end)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            end=mid-1;
            index=mid;
        }
        else{
            start=mid+1;
            index=mid+1;
        }
      }
      return index;
    }
}