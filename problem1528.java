class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i); // Move character to new position
        }
        
        return new String(result); // Convert char array to string
    }
}
