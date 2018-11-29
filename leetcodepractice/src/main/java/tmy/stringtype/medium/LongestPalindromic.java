package tmy.stringtype.medium;

/**
 * Created by tangminyan on 2018/11/29.
 *  Longest Palindromic Substring
 */
//TODO
public class LongestPalindromic {
    public String longestPalindrome(String s) {
        String tmp;
        String result = s;
        int len = 0;
        for (int i=0; i<s.length(); i++) {
            for(int j=i+1; j<s.length(); j++) {
                tmp = s.substring(i, j);
                int n = checkPalindrome(tmp);
                if(n >= len) {
                    len = n;
                    result = tmp;
                }
            }

        }
        return result;
    }

    private int checkPalindrome(String s) {
        StringBuffer buffer = new StringBuffer(s);
        if(s.equals(buffer.reverse().toString())) {
            return s.length();
        } else {
            return 1;
        }
    }

    /**
     *
     */
    private int lo, maxLen;

    public String longestPalindrome2(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }

}
