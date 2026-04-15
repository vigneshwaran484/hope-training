package Sugasri_HOPE_Batch_1.DAY_15;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr=new int[nums.length];
        arr[0]=1;
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            arr[i]*=right;
            right*=nums[i];
        }
        return arr;
    }
}