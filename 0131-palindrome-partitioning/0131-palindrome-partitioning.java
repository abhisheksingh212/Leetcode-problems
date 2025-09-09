class Solution {
    public List<List<String>> partition(String s) {
     List<List<String>> result = new ArrayList<>();
     helper(s,0,new ArrayList<>(),result);
     return result;
        
    }
    private void helper(String s,int index, List<String> current,List<List<String>> result)
    {
        if(index==s.length()){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=index;i<s.length();i++)
        { String substring = s.substring(index,i+1);
          if(isPalindrome(substring))
          {
            current.add(substring);
            helper(s,i+1,current,result);
            current.remove(current.size()-1);
          }

        }
    }

    private boolean isPalindrome(String s)
    {
        int left=0,right= s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            return false;
            
            left++;
            right--;
        }
        return true;
    }
}