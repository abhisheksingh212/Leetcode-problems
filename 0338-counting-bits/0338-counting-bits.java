class Solution {
    public int count(int n) {
        int b,sum=0;
        while(n>0)
        {b=n%2;
        sum+=b;
        n=n>>1;
        }
        return sum; 
    }
    public int[] countBits(int n) {
        int[] ar=new int[n+1];
        for(int i=0;i<=n;i++)
         {
            ar[i]=count(i);
         }
        return ar;
    }
}