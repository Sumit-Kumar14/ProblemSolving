package LeetCode.java;

public class _466 {
    /**
     * 466. Count The Repetitions
     * Hard
     *
     * Define S = [s,n] as the string S which consists of n connected strings s. For example, ["abc", 3] ="abcabcabc".
     *
     * On the other hand, we define that string s1 can be obtained from string s2 if we can remove some characters from s2 such that it becomes s1. For example, “abc” can be obtained from “abdbec” based on our definition, but it can not be obtained from “acbbe”.
     *
     * You are given two non-empty strings s1 and s2 (each at most 100 characters long) and two integers 0 ≤ n1 ≤ 106 and 1 ≤ n2 ≤ 106. Now consider the strings S1 and S2, where S1=[s1,n1] and S2=[s2,n2]. Find the maximum integer M such that [S2,M] can be obtained from S1.
     *
     * Input:
     * s1="acb", n1=4
     * s2="ab", n2=2
     *
     * Return:
     * 2
     */

    /*
        Brute force
     */
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int l1 = s1.length(), l2 = s2.length(), index = 0, repeat = 0;

        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < l1; j++) {
                if(s1.charAt(j) == s2.charAt(index))
                    index++;
                if(index == l2) {
                    index = 0;
                    repeat++;
                }
            }
        }
        return repeat / n2;
    }
}
