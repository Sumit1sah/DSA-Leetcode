class Solution {
    static Boolean[] dp;
    static boolean solve(int nums[],int index){
        if(index==nums.length-1){
            return true;
        }
        if(nums[index]==0){
            return false;
        }
        if(index>=nums.length){
            return false;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        int maxJump=nums[index];
        boolean Overall=false;
        for(int num=1;num<=maxJump;num++){
            boolean ReachAns=solve(nums,index+num);
            Overall=Overall||ReachAns;
            if(Overall){
                return dp[index]=true;
            }
        }
        return dp[index]=false;
    }
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int index=0;
        dp=new Boolean[nums.length];
        boolean ans=solve(nums,index);
        return ans;
    }
}