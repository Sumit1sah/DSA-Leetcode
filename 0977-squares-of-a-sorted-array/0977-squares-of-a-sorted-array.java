class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int square=nums[i]*nums[i];
            nums[i]=square;
        }
        Arrays.sort(nums);
        return nums;
    }
}