class Solution {
    public int reverseDegree(String s) {
       int n=s.length();
       int sum=0;
       for(int i=1;i<=n;i++){
        char ch=s.charAt(i-1);
        int value='z'-ch+1;
        sum=sum+value*i;
       } 
       return sum;
    }
}