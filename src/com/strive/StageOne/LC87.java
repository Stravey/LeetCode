package com.strive.StageOne;

@SuppressWarnings("all")
public class LC87 {
    public boolean isScramble(String s1, String s2) {
        return (s1.length() == s2.length()) && s1.equals(s2);
    }

    public static void main(String[] args) {
        LC87 lc = new LC87();
        lc.isScramble("abc", "def");
    }
}
