class Solution {
    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            // Last digit nikalo
            int digit = x % 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            // Digit ko reverse number me add karo
            rev = rev * 10 + digit;

            // Last digit remove karo
            x = x / 10;
        }

        return rev;
    }
}