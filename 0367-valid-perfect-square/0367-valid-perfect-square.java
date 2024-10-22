class Solution {
    public boolean isPerfectSquare(int num) {
        long n=num;
        long s1;
        for(long i=1;i*i<=num;i++)
        {
            s1=i*i;
            if(num==s1)
            return true;
        }
        return false;
    }
}