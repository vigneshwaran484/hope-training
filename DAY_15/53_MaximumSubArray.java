package Sugasri_HOPE_Batch_1.DAY_15;

class Solution {
    public int maxSubArray(int[] arr) {
         int max=arr[0];
         int current_max=arr[0];
         for(int num:arr){
            current_max=Math.max(num,current_max+num);
            max=Math.max(max,current_max);
         }
         return max;
    }
}