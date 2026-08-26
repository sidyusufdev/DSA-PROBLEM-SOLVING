class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // 1. Leading spaces remove karo
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Sign check karo
        int sign = 1;

        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        // 3. Number build karo
        int result = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // 4. Overflow check
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}