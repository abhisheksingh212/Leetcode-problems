class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3!=0){
            nums[i]-=nums[i]%3;
            count++;
            }else{
         continue;
            }
        }
        return count;
    }
}