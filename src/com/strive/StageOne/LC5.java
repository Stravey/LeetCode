package com.strive.StageOne;

public class LC5 {
    static class Solution {
        public String longestPalindrome(String s) {
            String res = "";
            int left = 0;
            int right = s.length();
            for(int i = 0;i < s.length();i++){
                for(int j = i + 1;j <= right;j++){
                    String str = s.substring(i,j);
                    if(isPalindrome(str) && str.length() > left) {
                        res = s.substring(i,j);
                        left = Math.max(left,res.length());
                    }
                }
            }
            return res;
        }

        public boolean isPalindrome(String s) {
            int len = s.length();
            for(int i = 0;i < len / 2;i++) {
                if(s.charAt(i) != s.charAt(len - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String s = new Solution().longestPalindrome("abcdefghihgfedcba");
        System.out.println(s);
    }
}
