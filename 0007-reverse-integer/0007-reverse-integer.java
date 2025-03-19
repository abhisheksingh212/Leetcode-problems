class Solution {
    public int reverse(int x) {
        int n=x,rev=0;
        while(n!=0)
        { 
          int d=n%10;
         
          if(rev<(Integer.MIN_VALUE)/10 || rev>(Integer.MAX_VALUE)/10){
          return 0;
          } rev=rev*10+d;
          n=n/10;
        }
return rev;
    }
}