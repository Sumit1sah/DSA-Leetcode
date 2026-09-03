class Solution {

    static void solve(int[] arr, int target, int index,List<List<Integer>> ans, List<Integer> output) {
        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }

        if (index >= arr.length || target < 0) {
            return;
        }

        output.add(arr[index]);
        solve(arr, target - arr[index], index, ans, output);
        output.remove(output.size() - 1);
        solve(arr, target, index + 1, ans, output);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        solve(candidates, target, 0, ans, output);
        return ans;
    }
}