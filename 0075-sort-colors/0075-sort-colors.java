import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
      int count1=0,count2=0,count0=0,n=nums.length;
      for(int i=0;i<n;i++)
      {
        if(nums[i]==0)
        count0++;
        else if(nums[i]==1)
        count1++;
        else if(nums[i]==2)
        count2++;
      }
      for(int i=0;i<n;i++)
      {
        if(i<count0)
        nums[i]=0;
        else if(i<(count0+count1))
        {nums[i]=1;}
        else
        {
            nums[i]=2;
        }
  
      }



    }
}