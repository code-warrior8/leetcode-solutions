class Solution {
    public int missingNumber(int[] nums) {
        int a=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            a+=nums[i];
            
        }
        return n*(n+1)/2-a;
    }
}