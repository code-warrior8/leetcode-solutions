class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1] && nums[i]<nums[i+1]){
                count++;
            }
        }
        return count;
    }
}