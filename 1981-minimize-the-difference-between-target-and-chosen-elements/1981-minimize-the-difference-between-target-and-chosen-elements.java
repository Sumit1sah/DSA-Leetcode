class Solution {

    static int[][] dp;

    static int solve(int mat[][], int target, int row, int sum) {
        if (row >= mat.length) {
            return Math.abs(target - sum);
        }
        if (dp[row][sum] != -1) {
            return dp[row][sum];
        }
        int mini = Integer.MAX_VALUE;
        for (int num : mat[row]) {
            int ans = solve(mat, target, row + 1, sum + num);
            mini = Math.min(mini, ans);
        }
        return dp[row][sum] = mini;
    }
    public int minimizeTheDifference(int[][] mat, int target) {

        int rows = mat.length;
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < rows; i++) {
            int max = 0;
            for (int num : mat[i]) {
                max = Math.max(max, num);
            }
            maxSum += max;
        }
        dp = new int[rows][maxSum + 1];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(mat, target, 0, 0);
    }
}