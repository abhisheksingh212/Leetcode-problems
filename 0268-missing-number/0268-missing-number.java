class Solution {
    public int missingNumber(int[] nums) {
      for(int i=0;i<=nums.length;i++)
      {
        boolean flag=false;
        for(int j=0;j<nums.length;j++)
        {
            if(i==nums[j])
            flag=true;
        }
        if(flag==false)
        {
            return i;
        }
      }
    
        return -1;
    }
}