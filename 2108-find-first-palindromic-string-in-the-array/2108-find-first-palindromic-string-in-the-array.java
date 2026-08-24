class Solution {

    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int s = 0;
            int e = word.length() - 1;
            boolean palindrome = true;
            while (s < e) {
                if (word.charAt(s) != word.charAt(e)) {
                    palindrome = false;
                    break;
                }
                s++;
                e--;
            }
            if (palindrome) {
                return word;
            }
        }
        return "";
    }
}