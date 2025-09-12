class Solution {
    public List<List<String>> solveNQueens(int n) {
    List<List<String>> result = new ArrayList<>();

        char board[][]= new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        Nqueens(board,0,result);
        return result;
    }
    private boolean isSafe(char board[][],int row,int col)
    {
        //vertical up
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
             if(board[i][j]=='Q')
            {
                return false;
            }
     
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
        {
             if(board[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }
    private void Nqueens(char board[][],int row,List<List<String>> result)
    {
        if(row==board.length)
        {
            result.add(construct(board));
            return;
        }
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                Nqueens(board,row+1,result);
                board[row][j]='.';
            }
        }
    }
    
    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }
}