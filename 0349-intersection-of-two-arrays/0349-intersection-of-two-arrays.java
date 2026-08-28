class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> ansSet = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }

        for(int num : nums2){
            if(set.contains(num)){
                ansSet.add(num);
            }
        }
        int[] ans = new int[ansSet.size()];
        int i = 0;
        for(int num : ansSet){
            ans[i++] = num;
        }
        return ans;
    }
}