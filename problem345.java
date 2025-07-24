class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        // Helper method to check for vowels
        while (left < right) {
            while (left < right && !isVowel(chars[left])) left++;
            while (left < right && !isVowel(chars[right])) right--;
            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
