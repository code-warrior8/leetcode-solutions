class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128]; // ASCII size

        // Count frequencies using normal for loop
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // Go through count[] array using regular for loop
        for (int i = 0; i < 128; i++) {
            if (count[i] % 2 == 0) {
                length += count[i];
            } else {
                length += count[i] - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) length += 1;

        return length;
    }
}

