class Solution {
    static Integer[] dp;
    static int solve(int nums[],int index){
        if(index>=nums.length){
            return 0;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        int includeAns=nums[index]+solve(nums,index+2);
        int excludeAns=0+solve(nums,index+1);
        int finalAns=Math.max(includeAns,excludeAns);
        return dp[index]=finalAns;
    }
    public int rob(int[] nums) {
        int index=0;
        dp=new Integer[nums.length];
        int ans=solve(nums,index);
        
        return ans;
    }
}