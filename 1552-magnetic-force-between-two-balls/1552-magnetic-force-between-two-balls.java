class Solution {
    static boolean isvalid(int arr[],int k, int mid){
        int cow=1;
        int distance=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-arr[distance]>=mid){
                cow++;
                distance=i;
                if(cow==k){
                    return true;
                }
            }
        }

        return false;
    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        int s=0;
        int ans=-1;
        Arrays.sort(position);
        int e=position[n-1]-position[0];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isvalid(position,m,mid)){

                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }
}