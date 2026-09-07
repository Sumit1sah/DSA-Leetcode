class Solution {
    static void merge(int arr[],int s,int e,int mid){
       int leftLength=mid-s+1;
       int rightLength=e-mid; 
       int leftarr[]=new int[leftLength];
       int rightarr[]=new int[rightLength];
       int k=s;
       for(int i=0;i<leftLength;i++){
            leftarr[i]=arr[k];
            k++;
        }
       k=mid+1;
       for(int i=0;i<rightLength;i++){
            rightarr[i]=arr[k];
            k++;
        }
        int i=0;
        int j=0;
        k=s;
        while(i<leftLength&&j<rightLength){
            if(leftarr[i]<=rightarr[j]){
                arr[k]=leftarr[i];
                i++;
            }else{
                arr[k]=rightarr[j];
                j++;
            }
            k++;
        }
        while(i<leftLength){
            arr[k]=leftarr[i];
            i++;
            k++;
        }
        while(j<rightLength){
            arr[k]=rightarr[j];
            j++;
            k++;
        }
    }
    static void mergesort(int nums[],int s,int e){
        if(s>=e){
            return; 
        }
        int mid=s+(e-s)/2;
            mergesort(nums,s,mid);
            mergesort(nums,mid+1,e);
            merge(nums,s,e,mid);
    }
    public int[] sortArray(int[] nums) {
       int s=0;
       int e=nums.length-1;
       mergesort(nums,s,e);
       return nums;
    }
}