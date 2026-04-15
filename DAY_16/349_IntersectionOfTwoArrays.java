package Sugasri_HOPE_Batch_1.DAY_16;

import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num1:nums2){
            if(set1.contains(num1)){
                set2.add(num1);
            }
        }
        int[] arr=new int[set2.size()];
        int i=0;
        for(int num2:set2){
            arr[i++]=num2;
        }
        return arr;
    }
}