class Solution {
    private static final int MOD = 1000000007;

    public int countGoodNumbers(long n) {
    long evenPosition = (n+1)/2;
    long oddPosition= n/2;

    long evenChoices = fastPow(5,evenPosition);
    long oddChoices = fastPow(4,oddPosition);

    long result = (evenChoices * oddChoices)% MOD;
    
    return (int)(result);
    }
    private long fastPow(long base,long exp)
    {
      if(exp == 0)
      return 1;

      long result=1;
      base = base % MOD;
      while(exp>0)
      {
        if(exp%2==1)
        {
            result = (result*base) % MOD;
        }
        base = (base* base) % MOD;
        exp=exp/2;
      }
      return result;
    }
}