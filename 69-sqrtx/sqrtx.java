class Solution {
    public int mySqrt(int x) {
        int ans=-1;
        int s=0;
        int e=x;
        while(s<=e){
            int mid=s+(e-s)/2;
            long square = (long) mid * mid;
            if(square==x){
                return mid;
            }else if(square>x){
                e=mid-1;
            }else{
                s=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}