class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> list = new HashMap<>();

        for (int i = 0; i < n; i++) {
            list.put(nums[i], list.getOrDefault(nums[i], 0) + 1);
        }

        if (k == n) {
            int maxValue = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                maxValue = Math.max(maxValue, nums[i]);
            }

            return maxValue;
        }

        if (k == 1) {
            int maxValue = -1;

            for (int i = 0; i < n; i++) {
                if (list.get(nums[i]) == 1) {
                    maxValue = Math.max(maxValue, nums[i]);
                }
            }

            return maxValue;
        }

        int first = nums[0];
        int last = nums[n - 1];

        if (first == last) {
            return -1;
        }

        if (list.get(first) == 1) {

            if (list.get(last) == 1) {
                return Math.max(first, last);
            }

            return first;
        }

        if (list.get(last) == 1) {
            return last;
        }

        return -1;
    }
}