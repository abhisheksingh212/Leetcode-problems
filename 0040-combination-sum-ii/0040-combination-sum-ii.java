class Solution {
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result =new ArrayList<>();
        Arrays.sort(candidates);
        generateCombinations(candidates,0,target,new ArrayList<>(),result);
        return result;
        
    }
private void generateCombinations(int[] nums,int index,int target,List<Integer> curr,List<List<Integer>> result)
{  if(target==0){
    result.add(new ArrayList<>(curr));
    return;
}
if(index==nums.length || target<0)
  return;

curr.add(nums[index]);
generateCombinations(nums,index+1,target-nums[index],curr,result);
curr.remove(curr.size()-1);

while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
index++;
}
generateCombinations(nums, index + 1, target, curr, result);
}

}
