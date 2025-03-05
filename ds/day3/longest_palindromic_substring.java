package day3;
public class longest_palindromic_substring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Expand for odd-length palindromes
            int len1 = expandAroundCenter(s, i, i);
            // Expand for even-length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);

            int maxLen = Math.max(len1, len2);

            if (maxLen > (end - start)) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // Driver Code
    public static void main(String[] args) {
        longest_palindromic_substring solution = new longest_palindromic_substring();

        System.out.println(solution.longestPalindrome("babad")); // Output: "bab" or "aba"
        System.out.println(solution.longestPalindrome("cbbd")); // Output: "bb"
        System.out.println(solution.longestPalindrome("a")); // Output: "a"
        System.out.println(solution.longestPalindrome("ac")); // Output: "a"
    }
}
