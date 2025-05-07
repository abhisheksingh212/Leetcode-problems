class Solution {
    public int maximumCount(int[] nums) {
    int n=nums.length,posCount=0,negCount=0;
    for(int i=0;i<n;i++)
    {
        if(nums[i]>0)
        {
            posCount++;
        }
        else if(nums[i]<0)
        {
            negCount++;
        }
    }
        return posCount>negCount?posCount:negCount;
    }
}