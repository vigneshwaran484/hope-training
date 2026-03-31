class Solution {
    public String convert(String s, int numRows) {
        if ( s.length()<numRows ||numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean flag = false;

        for (char c : s.toCharArray()) {
            rows[currRow].append(c);

            if (currRow == 0 || currRow == numRows - 1) {
                flag = !flag;
            }

            currRow += flag ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
