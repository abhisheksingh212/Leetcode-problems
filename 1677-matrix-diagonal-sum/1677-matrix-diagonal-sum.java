class Solution {
    public int diagonalSum(int[][] mat) {
        int diagonalSum=0,antiDiagonalSum=0;
        int n=mat.length;
        for(int i=0;i<n;i++)
        {   diagonalSum+=mat[i][i];
            antiDiagonalSum+=mat[i][n-i-1];
            }
        if(n%2!=0)
        { int mid=mat[n/2][n/2];
          return diagonalSum+antiDiagonalSum-mid;
        }
        return diagonalSum+antiDiagonalSum;
    }
}