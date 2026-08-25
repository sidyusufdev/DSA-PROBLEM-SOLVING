class Solution {
    public String convert(String s, int numRows) {

        // Edge case
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        // Create StringBuilder for every row
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        int direction = 1; // 1 = down, -1 = up

        for (char ch : s.toCharArray()) {

            // Put character in current row
            rows[row].append(ch);

            // Change direction at top and bottom
            if (row == 0) {
                direction = 1;
            } else if (row == numRows - 1) {
                direction = -1;
            }

            // Move to next row
            row += direction;
        }

        // Combine all rows
        StringBuilder answer = new StringBuilder();

        for (StringBuilder r : rows) {
            answer.append(r);
        }

        return answer.toString();
    }
}