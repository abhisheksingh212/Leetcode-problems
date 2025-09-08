class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        helper(1,k,n,new ArrayList<>(),result);
        return result; 
    }
    private void helper(int current,int k,int target,List<Integer> currComb,List<List<Integer>> result)
    {
        if(currComb.size()==k && target==0){
        result.add(new ArrayList<>(currComb));
        return;
        }
        if(current >9 || currComb.size()>=k || target<0)
         return ;
        
        if(current<=target){
        currComb.add(current);
        helper(current+1,k,target-current,currComb,result);
        currComb.remove(currComb.size()-1);
        }

        helper(current+1,k,target,currComb,result);
    }
    
}