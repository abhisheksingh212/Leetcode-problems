class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n=nums.length;
      
        int arr[]=new int[n];
        int pindex=0,nindex=1;

   for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[pindex] = nums[i];
                pindex += 2;
            } else {
                arr[nindex] = nums[i];
                nindex += 2;
            }
        }    
return arr;
    }
}