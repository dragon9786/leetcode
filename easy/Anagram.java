/**
 * https://leetcode.com/problems/valid-anagram/
 *
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram", Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car", Output: false
 *
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 * 
 **/
 class Solution {
    public boolean isAnagram(String s, String t) {
        int[] chars = new int[26];
        if(s.length() != t.length()) return false;
        for(int i = 0; i< t.length(); i++) {
            int idx = t.charAt(i) - 'a';
            chars[idx]++;
        }

        for(int i = 0; i< s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if(chars[idx] == 0) return false;
            chars[idx]--;
        }
        return true;

    }
}