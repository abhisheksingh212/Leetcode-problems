class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        generateSubset(nums,0,new ArrayList<>(),result);
        return result;
    }
    private void generateSubset(int[] nums, int index,List<Integer> current,List<List<Integer>> result)
    {    result.add(new ArrayList<>(current));

        for(int i=index;i<nums.length;i++){
            if (i > index && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);                       
            generateSubset(nums, i + 1, current, result);      
            current.remove(current.size() - 1);     
     }
        
    }
}