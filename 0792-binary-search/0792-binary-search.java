class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        if(nums.length==1 && nums[0]==target)
        {
            return 0;
        }
        else
        {
          while(left<=right)
         {
            int mid=left+(right-left)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target<nums[mid])
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return -1;
        }
    }
}