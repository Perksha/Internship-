class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes (centered at a single character)
            String oddPalindrome = expandAroundCenter(s, i, i);
            // Check for even-length palindromes (centered between two characters)
            String evenPalindrome = expandAroundCenter(s, i, i + 1);

            // Update the answer with the longest palindrome found
            if (oddPalindrome.length() > ans.length()) {
                ans = oddPalindrome;
            }
            if (evenPalindrome.length() > ans.length()) {
                ans = evenPalindrome;
            }
        }

        return ans;
    }

    private String expandAroundCenter(String s, int left, int right) {
        // Expand as long as the characters at left and right are equal
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the longest palindrome found in this expansion
        return s.substring(left + 1, right);
    }
}
