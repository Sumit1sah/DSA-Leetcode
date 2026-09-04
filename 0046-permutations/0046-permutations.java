class Solution {

    static void solve(int nums[], boolean used[],List<List<Integer>> ans,List<Integer> output){
        if (output.size() == nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            output.add(nums[i]);
            solve(nums, used, ans, output);
            output.remove(output.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        boolean used[] = new boolean[nums.length];

        solve(nums, used, ans, output);

        return ans;
    }
}