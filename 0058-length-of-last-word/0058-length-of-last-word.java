class Solution {
    public int lengthOfLastWord(String s) {
        
        int i = s.length() - 1;
        
        // Step 1: End ki spaces skip karo
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        // Step 2: Last word ki length count karo
        int count = 0;
        
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        
        return count;
    }
}