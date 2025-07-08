class Solution {
    public void reverseString(char[] s) {
        int left = 0; // start pointer
        int right = s.length - 1; // end pointer
        
        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move pointers inward
            left++;
            right--;
        }
    }
}
