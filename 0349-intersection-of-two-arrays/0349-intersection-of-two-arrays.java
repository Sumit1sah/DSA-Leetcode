class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();
        Set<Integer> list3 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            list1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            list2.add(nums2[i]);
        }
        for(int num : list1){
            if(list2.contains(num)){
                list3.add(num);
            }
        }
        int[] ans = new int[list3.size()];
        int i = 0;
        for(int num : list3){
            ans[i] = num;
            i++;
        }
        return ans;
    }
}