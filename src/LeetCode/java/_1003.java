package LeetCode.java;

import java.util.Stack;

public class _1003 {

    /**
     * 1003. Check If Word Is Valid After Substitutions
     * Medium
     *
     * We can say that a string is valid if it follows one of the three following cases:
     *
     * An empty string "" is valid.
     * The string "abc" is also valid.
     * Any string in the form "a" + str + "bc", "ab" + str + "c", str + "abc" or "abc" + str where str is a valid string is also considered a valid string.
     * For example, "", "abc", "aabcbc", "abcabc" and "abcabcababcc" are all valid strings, while "abccba", "ab", "cababc" and "bac" are not valid strings.
     *
     * Given a string s, return true if it is a valid string, otherwise, return false.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "aabcbc"
     * Output: true
     * Explanation:
     * We start with the valid string "abc".
     * Then we can insert another "abc" between "a" and "bc", resulting in "a" + "abc" + "bc" which is "aabcbc".
     * Example 2:
     *
     * Input: s = "abcabcababcc"
     * Output: true
     * Explanation:
     * "abcabcabc" is valid after consecutive insertings of "abc".
     * Then we can insert "abc" before the last letter, resulting in "abcabcab" + "abc" + "c" which is "abcabcababcc".
     * Example 3:
     *
     * Input: s = "abccba"
     * Output: false
     * Example 4:
     *
     * Input: s = "cababc"
     * Output: false
     *
     * Constraints:
     *
     * 1 <= s.length <= 2 * 104
     * s[i] is 'a', 'b', or 'c'
     */

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char current : s.toCharArray()) {
            if(current == 'c') {
                if(stack.size() >= 2) {
                    if(stack.pop() != 'b' || stack.pop() != 'a') {
                        return false;
                    }
                }else {
                    return false;
                }
            }else {
                stack.push(current);
            }
        }

        return stack.isEmpty();
    }

}
