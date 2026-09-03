class Solution {
    static void solve(int arr[],int target,int index,List<List<Integer>>ans,List<Integer>output){
        if(target==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(target<0||index>=arr.length){
            return;
        }
        int currentValue=arr[index];
        output.add(currentValue);
        solve(arr,target-currentValue,index+1,ans,output);
        output.remove(output.size()-1);
        while(index+1<arr.length&&arr[index]==arr[index+1]){
            index++;
        }
        solve(arr,target,index+1,ans,output);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(candidates,target,index,ans,output);
        return ans;
    }
}