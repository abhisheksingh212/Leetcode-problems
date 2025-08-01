class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        
        int left=0,right=nums.length-1;
          while(left<=right)
         {
            int mid=left+(right-left)/2;
           if ((mid == 0 || nums[mid] != nums[mid - 1]) &&
                (mid == nums.length - 1 || nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }
            else if((mid%2==0 && nums[mid+1]==nums[mid]) ||
                    (mid%2!=0 && nums[mid-1]==nums[mid]))
            {
              left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
}

      
