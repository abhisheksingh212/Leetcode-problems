class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        int n=nums.length;
        HashMap<Integer,Integer>hm =new HashMap<>();
        for(int i=0;i<n;i++)
        { int sum=nums[i];
        int moreNeeded=target-sum;

        if(hm.containsKey(moreNeeded))
        {
            ans[0]=hm.get(moreNeeded);
            ans[1]=i;
        }
        hm.put(nums[i],i);

        }
        return ans;
       
    }
}