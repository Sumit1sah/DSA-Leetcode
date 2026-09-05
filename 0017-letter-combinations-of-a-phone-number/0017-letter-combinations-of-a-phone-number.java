class Solution {
    static void solve(String digits,List<String>ans,String dialpad[],int index,StringBuilder output){
        if(index>=digits.length()){
            ans.add(output.toString());
            return;
        }
        int value = digits.charAt(index) - '0';
        String mappedString=dialpad[value];
        for(int i=0;i<mappedString.length();i++){
            output.append(mappedString.charAt(i));
            solve(digits,ans,dialpad,index+1,output);
            output.deleteCharAt(output.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        String dialpad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder output=new StringBuilder();
        int index=0;
        solve(digits,ans,dialpad,index,output);
        return ans;
    }
}