package Sugasri_HOPE_Batch_1.DAY_16;

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consumed=numBottles;
        while(numBottles>=numExchange){
            int newBottles=numBottles/numExchange;
            int left=numBottles%numExchange;
            consumed+=newBottles;
            numBottles=left+newBottles;
        }
        return consumed;
    }
}