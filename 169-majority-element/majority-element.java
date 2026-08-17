class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> list = new HashMap<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            list.put(nums[i], list.getOrDefault(nums[i], 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (int k : list.keySet()) {
            if (list.get(k) > max) {
                max = list.get(k);
                ans = k;
            }
        }

        return ans;
    }
}