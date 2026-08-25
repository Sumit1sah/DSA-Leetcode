class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sumarray=0;
        int sumdigit=0;
        for(int i=0;i<n;i++){
            sumarray=sumarray+nums[i];
            while(nums[i]!=0){
                int digit=nums[i]%10;
                sumdigit=sumdigit+digit;
                nums[i]=nums[i]/10;
            }
        }
        int diff=Math.abs(sumarray-sumdigit);
        return diff;
    }
}