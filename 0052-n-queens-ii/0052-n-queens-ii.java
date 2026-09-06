class Solution {
    static boolean isSafePlace(int rowIndex,int colIndex,char board[][],int n){
        int row=rowIndex;
        int col=colIndex;
        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        row=rowIndex;
        col=colIndex;
        while(row>=0&&col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        row=rowIndex;
        col=colIndex;
        while(row<n&&col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
    static int solve(char board[][],int colIndex,int n){
        if(colIndex>=n){
            return 1;
        }
        int count=0;
        for(int rowIndex=0;rowIndex<n;rowIndex++){
            if(isSafePlace(rowIndex,colIndex,board,n)){
                board[rowIndex][colIndex]='Q';
                count=count+solve(board,colIndex+1,n);
                board[rowIndex][colIndex]='.';
            }
        }
        return count;
    }
    public int totalNQueens(int n) {
        char board[][]=new char[n][n];
        int colIndex=0;
        return solve(board,colIndex,n);
    }
}