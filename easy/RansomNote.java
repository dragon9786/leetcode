/**
 * https://leetcode.com/problems/ransom-note/
 *
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.
 *
 * Note:
 * You may assume that both strings contain only lowercase letters.
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 *
 **/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magChar = new int[26];
        for(int i = 0; i< magazine.length(); i++) {
            int idx = magazine.charAt(i) - 'a';
            magChar[idx]++;
        }

        for(int i = 0; i< ransomNote.length(); i++) {
            int idx = ransomNote.charAt(i) - 'a';
            if(magChar[idx] == 0) return false;
            magChar[idx]--;
        }
        return true;
    }
}