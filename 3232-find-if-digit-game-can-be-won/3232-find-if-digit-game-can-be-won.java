class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int alice;
        int bob;
        int oneDigit=0;
        int twoDigit=0;
        for(int i=0;i<n;i++){
            if(nums[i]>9){
                twoDigit=twoDigit+nums[i];
            }else{
                oneDigit=oneDigit+nums[i];
            }
        }
        return oneDigit!=twoDigit;
    }
}