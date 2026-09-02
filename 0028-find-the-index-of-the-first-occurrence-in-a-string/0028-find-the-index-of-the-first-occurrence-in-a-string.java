class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        // Har possible starting position
        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // needle ko haystack ke current position se compare karo
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // Pura needle match ho gaya
            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}