class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeroes, int numNegOnes, int k) {
        int count=0;
        if(k<=numOnes)  return k;
        else if(k<=(numOnes+numZeroes)) return numOnes;
        else return (numOnes-(k-(numOnes+numZeroes)));
    }
}