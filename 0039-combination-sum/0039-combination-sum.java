class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result =new ArrayList<>();
        helper(candidates,0,target,new ArrayList<>(),result);
        return result; 
    }
    private void helper(int[] candidates,int index,int target,List<Integer> curr,List<List<Integer>> result)
    {
        if(target==0){
        result.add(new ArrayList<>(curr));
        return;
        }
        if((index == candidates.length)|| target<0)
         return ;
        
        if(candidates[index]<=target){
        curr.add(candidates[index]);
        helper(candidates,index,target-candidates[index],curr,result);
        curr.remove(curr.size()-1);
        }

        helper(candidates,index+1,target,curr,result);
    }
}