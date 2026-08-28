class Solution {

    static Boolean dp[][];

    static boolean solve(int[] nums, int index, int target) {

        if (target == 0) {
            return true;
        }
        if (index >= nums.length || target < 0) {
            return false;
        }
        if (dp[index][target] != null) {
            return dp[index][target];
        }
        boolean include = solve(nums, index + 1, target - nums[index]);
        boolean exclude = solve(nums, index + 1, target);
        dp[index][target] = include || exclude;
        return dp[index][target];
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        dp = new Boolean[nums.length][target + 1];
        return solve(nums, 0, target);
    }
}