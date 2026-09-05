class Solution {
    static boolean isSafePlace(char board[][],int rowIndex,int colIndex,int n){
        //checking just left horizontal
        int row=rowIndex;
        int col=colIndex;
        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        // checkign just left upper diagnol
        row=rowIndex;
        col=colIndex;
        while(row>=0&&col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        // chickign jsut left lower diagnol
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
    static void solve(char board[][],List<List<String>>ans,int colIndex,int n){
        if(colIndex>=n){
            List<String>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int rowIndex=0;rowIndex<n;rowIndex++){
            if(isSafePlace(board,rowIndex,colIndex,n)){
                board[rowIndex][colIndex]='Q';
                solve(board,ans,colIndex+1,n);
                board[rowIndex][colIndex]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
       char board[][]=new char[n][n];
       for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        List<List<String>> ans=new ArrayList<>();
        int colIndex=0;
        int RowIndex=0;
        solve(board,ans,colIndex,n);
        return ans;
    }
}