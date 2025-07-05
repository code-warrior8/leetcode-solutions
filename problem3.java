class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] n=new int[128];
        int max=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char curr=s.charAt(right);
            left=Math.max(n[curr],left);
            max=Math.max(max,right-left+1);
            n[curr]=right+1;
        }
        return max;
    }
}