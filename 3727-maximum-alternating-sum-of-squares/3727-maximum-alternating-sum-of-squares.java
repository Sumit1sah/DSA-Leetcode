class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int mid=n/2;
        for(int i=0;i<mid;i++){
           sum=sum-nums[i];
        }
        for(int i=mid;i<n;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
}