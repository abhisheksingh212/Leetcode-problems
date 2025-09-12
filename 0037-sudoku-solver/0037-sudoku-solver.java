class Solution {
    public void solveSudoku(char[][] board) {
        if(sudokuSolver(board,0,0))
        {
            printSudoku(board);
        }
    }
    private boolean sudokuSolver(char[][] board,int row, int col)
    {
        if(row==9)return true;

        int nextRow=row,nextCol=col+1;
        if(col+1==9)
        {
            nextRow=row+1;
            nextCol=0;
        }
        if(board[row][col]!='.')
        {
            return sudokuSolver(board,nextRow,nextCol);
        }

        for(int digit=1;digit<=9;digit++)
        {char ch = (char)(digit + '0');
            if(isSafe(board,row,col,ch))
            {
                board[row][col]=(char)(digit + '0');
                if(sudokuSolver(board,nextRow,nextCol))
                {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
     private boolean isSafe(char[][] board, int row, int col, char digit) {
        // check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) return false;
        }
        // check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit) return false;
        }
        // check 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit) return false;
            }
        }
        return true;
    }
    private void printSudoku(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(board[i][j]+"");
            }
            System.out.println();
        }
    }
}