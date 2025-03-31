class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n=nums.length,countN,countP,index=0;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int arr[]=new int[n];
        int pindex=0,nindex=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                pos[pindex++]=nums[i];
            }
            else{
                neg[nindex++]=nums[i];
            }
        }
  pindex=0;nindex=0;
  for(int i=0;i<n;i+=2)
  {
    arr[i]=pos[pindex++];
    arr[i+1]=neg[nindex++];
  }
   
        
return arr;
    }
}