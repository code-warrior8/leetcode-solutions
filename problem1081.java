//-----------SMALLEST SUBSEQUENCE OF DISTINCT CHARACTER--------

// Given a string s, return the lexicographically smallest subsequence of s that contains all the distinct characters of s exactly once.

// Example 1:

// Input: s = "bcabc"
// Output: "abc"
// Example 2:

// Input: s = "cbacdcbc"
// Output: "acdb"

import java.util.*;

class Solution {
    public String smallestSubsequence(String s) {
        Map<Character, Integer> map = new HashMap<>();
        // store last occurrence of each character
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        Set<Character> set = new HashSet<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            // if already taken, skip
            if (set.contains(curr)) continue;

            // maintain lexicographic order
            while (!stack.isEmpty() && stack.peek() > curr && map.get(stack.peek()) > i) {
                set.remove(stack.pop());
            }

            stack.push(curr);
            set.add(curr);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
