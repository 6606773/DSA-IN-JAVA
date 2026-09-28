import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to group words by their sorted key
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            // Sort the characters in the word to form the key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            // Add the word to the correct group
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        
        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(sol.groupAnagrams(strs1));
        
        String[] strs2 = {""};
        System.out.println(sol.groupAnagrams(strs2));
        
        String[] strs3 = {"a"};
        System.out.println(sol.groupAnagrams(strs3));
    }
  }