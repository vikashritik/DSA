class Solution {
    public int thirdMax(int[] arr) {
       long thirdmax=Long.MIN_VALUE;
       long secondmax=Long.MIN_VALUE;
       long max=Long.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       for(int i=0;i<arr.length;i++){
        if(arr[i]>secondmax && arr[i]<max){
            secondmax=arr[i];
        }
       }
        for(int i=0;i<arr.length;i++){
        if(arr[i]>thirdmax && arr[i]<max && arr[i]<secondmax){
            thirdmax=arr[i];
        }
        }
    if(thirdmax==Long.MIN_VALUE ){
        return (int)max;
    }
 
    else{
        return (int)thirdmax;
    }
  }
}