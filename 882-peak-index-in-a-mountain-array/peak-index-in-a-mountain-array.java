class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // We are on the increasing side
                s = mid + 1;
            } else {
                // We are on the decreasing side or at the peak
                e = mid;
            }
        }

        return s;
    }
}