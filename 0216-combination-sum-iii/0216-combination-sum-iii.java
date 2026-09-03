class Solution {
    static void solve(int arr[],int index,int n,List<List<Integer>> ans,List<Integer> output,int count,int k){
        if(count>k){
            return;
        }
        if(count==k&&n==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index>=arr.length){
            return;
        }
        output.add(arr[index]);
        solve(arr,index+1,n-arr[index],ans,output,count+1,k);
        output.remove(output.size()-1);
        while(index+1<arr.length&&arr[index]==arr[index+1]){
            index++;
        }
        solve(arr,index+1,n,ans,output,count,k);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int candidates[]={1,2,3,4,5,6,7,8,9};
        int count=0;
        int index=0;
        solve(candidates,index,n,ans,output,count,k);
        return ans;
    }
}