class Solution {
    public int hammingWeight(int n) {
        int b,sum=0;
        while(n>0)
        {b=n%2;
        sum+=b;
        n=n>>1;
       
        }
        return sum;
        
    }
}