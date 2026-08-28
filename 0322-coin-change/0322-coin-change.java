class Solution {

    static int solve(int coins[], int amount,int coine[]) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }
        if(coine[amount]!= -1){
            return coine[amount];
        }
        int mini = Integer.MAX_VALUE;
        for (int coin : coins) {
            int recursionAns = solve(coins, amount - coin,coine);
            if (recursionAns == Integer.MAX_VALUE) {
                continue;
            }
            int totalCoinUsed = recursionAns + 1;
            mini = Math.min(mini, totalCoinUsed);
        }
        coine[amount]=mini;
        return coine[amount];
    }
    public int coinChange(int[] coins, int amount) {
        int coine[]=new int[amount+1];
        Arrays.fill(coine,-1);
        int ans = solve(coins, amount,coine);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }
}