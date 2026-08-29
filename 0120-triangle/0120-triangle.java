class Solution {
    static Integer[][] dp;
    static int solve(List<List<Integer>> triangle,int row,int col){
        if(row==triangle.size()-1){
            return triangle.get(row).get(col);
        }
        if(dp[row][col] != null){
            return dp[row][col];
        }
        int DownAns=solve(triangle,row+1,col);
        int DiagnolAns=solve(triangle,row+1,col+1);
        int finalAns=triangle.get(row).get(col)+Math.min(DownAns,DiagnolAns);
        return dp[row][col]=finalAns;
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int row=0;
        int col=0;
        int n=triangle.size();
        dp= new Integer[n][n];
        int ans=solve(triangle,row,col);
        return ans;
    }
}