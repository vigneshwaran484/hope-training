package Sugasri_HOPE_Batch_1.DAY_15;

class Solution {
    public int majorityElement(int[] nums) {
        int value=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                value=num;
            }
            if(value==num){
                count++;
            }
            else{
                count--;
            }
        }
        return value;
    }
}
