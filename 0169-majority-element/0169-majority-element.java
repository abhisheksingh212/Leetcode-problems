class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
      for(Integer k:hm.keySet())
      {
        if(hm.get(k)>(n/2))
        {
            return k;
        }
      }
        return -1;
    }
}