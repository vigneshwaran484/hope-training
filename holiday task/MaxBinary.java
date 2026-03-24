class MaxBinary {
    public String maximumOddBinaryNumber(String s) {
        int ones=0;
        for(char c:s.toCharArray()) if(c=='1') ones++;
        int zeros=s.length()-ones;
        return "1".repeat(ones-1)+"0".repeat(zeros)+"1";
    }
}