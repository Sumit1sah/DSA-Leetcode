class Solution {

    static int binarysearch(int nums[], int s, int e, int target) {

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }

        return -1;
    }

    static int pivot(int arr[]) {

        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        // Array is already sorted
        if (arr[s] <= arr[e]) {
            return -1;
        }

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] <= arr[n - 1]) {
                e = mid - 1;
            }
            else {
                ans = mid;
                s = mid + 1;
            }
        }

        return ans;
    }

    public int search(int[] nums, int target) {

        int n = nums.length;

        // Single element
        if (n == 1) {
            if (nums[0] == target) {
                return 0;
            }
            return -1;
        }

        int pivotIndex = pivot(nums);

        // Array is already sorted
        if (pivotIndex == -1) {
            return binarysearch(nums, 0, n - 1, target);
        }

        // First sorted part
        int start1 = 0;
        int end1 = pivotIndex;

        if (target >= nums[start1] && target <= nums[end1]) {
            return binarysearch(nums, start1, end1, target);
        }

        // Second sorted part
        int start2 = pivotIndex + 1;
        int end2 = n - 1;

        if (target >= nums[start2] && target <= nums[end2]) {
            return binarysearch(nums, start2, end2, target);
        }

        return -1;
    }
}