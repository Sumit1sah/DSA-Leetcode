class Solution {
    static boolean compare(int count1[],int count2[]){
        for( int i=0;i<26;i++){
            if(count1[i]!=count2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int count1[]=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            int index=ch-'a';
            count1[index]++;
        }
        int i=0;
        int windowLength=s1.length();
        int count2[]=new int[26];
        for(i=0;i<windowLength;i++){
            char ch=s2.charAt(i);
            int index=ch-'a';
            count2[index]++;
        }
        if(compare(count1,count2)){
            return true;
        }else{
            while(i<s2.length()){
                char newchar=s2.charAt(i);
                int newIndex=newchar-'a';
                count2[newIndex]++;

                int oldCharIndex=i-windowLength;
                char charOld=s2.charAt(oldCharIndex);
                int freqtableofOldchar=charOld-'a';
                count2[freqtableofOldchar]--;
                if(compare(count1,count2)){
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}