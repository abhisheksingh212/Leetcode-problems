class Solution {
    public int missingNumber(int[] nums) {
    int n=nums.length,sum=0;
    for(int i=0;i<=n;i++)
    {
        sum^=i;
    }
      for(int i=0;i<n;i++)
    {
        sum^=nums[i];
    }
    return sum;
    } 
}