class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> result =new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            fact*=i;
            result.add(i);
        }
        result.add(n);
        k=k-1;
        String ans ="";
        while(true)
        { ans = ans + result.get(k/fact);
          result.remove(k/fact);
          if(result.size()==0){
          break;
        }
        k = k%fact;
        fact = fact/result.size();
        }
        return ans;
    }
}