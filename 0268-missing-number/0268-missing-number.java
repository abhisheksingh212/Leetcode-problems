class Solution {
    public int missingNumber(int[] nums) {
    int n=nums.length,asum=0;
    int sum=n*(n+1)/2;
    for(int i=0;i<n;i++)
    {
        asum+=nums[i];
    }
    return sum-asum;
    }
}