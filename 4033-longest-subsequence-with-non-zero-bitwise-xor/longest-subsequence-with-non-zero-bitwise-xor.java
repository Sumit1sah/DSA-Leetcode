class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        if(Arrays.equals(nums,arr)){
            return 0;
        }
        int m=0;
        for(int i=0;i<n;i++){
            m=m^nums[i];
        }
        return m!=0 ? n: n-1;
    }
}