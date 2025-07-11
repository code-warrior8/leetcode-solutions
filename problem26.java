class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums==null || nums.length==0) {
        return 0;
       }
       int index=1;
       int pre=nums[0];
       for(int i=1;i<nums.length;i++){
        if(nums[i]==pre){
            continue;
        }else{
            nums[index++]=nums[i];
            pre=nums[i];
        }
       }
       return index;
    }
    
}