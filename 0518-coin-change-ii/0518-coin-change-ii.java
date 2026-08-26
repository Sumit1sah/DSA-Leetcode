class Solution {

    static int solve(int amount, int coins[], int index, int dp[][]) {

        if(amount == 0) {
            return 1;
        }

        if(amount < 0) {
            return 0;
        }

        if(index >= coins.length) {
            return 0;
        }

        if(dp[amount][index] != -1) {
            return dp[amount][index];
        }

        int includeAns = solve(amount - coins[index],coins,index,dp);
        int excludeAns = solve(amount,coins,index + 1,dp);
        dp[amount][index] = includeAns + excludeAns;
        return dp[amount][index];
    }

    public int change(int amount, int[] coins) {

        int dp[][] = new int[amount + 1][coins.length];

        for(int i = 0; i <= amount; i++) {
            for(int j = 0; j < coins.length; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(amount, coins, 0, dp);
    }
}