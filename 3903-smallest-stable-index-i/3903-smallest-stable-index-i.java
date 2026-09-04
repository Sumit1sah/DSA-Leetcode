class Solution {

    static int solve(int nums[], int k, int index) {
        if (index >= nums.length) {
            return -1;
        }
        int max = nums[0];
        int min = nums[index];
        for (int i = 0; i <= index; i++) {
            max = Math.max(max, nums[i]);
        }
        for (int i = index; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        int diff = max - min;
        if (diff <= k) {
            return index;
        }
        return solve(nums, k, index + 1);
    }
    public int firstStableIndex(int[] nums, int k) {
        return solve(nums, k, 0);
    }
}