package tmy.stringtype.hard;


/**
 * Created by tangminyan on 2018/12/3.
 *
 *   Regular Expression Matching
 */
//TODO
public class RegularExpression {
    public boolean isMatch(String s, String p) {
        int i=0, j=0;
        if(!p.contains("*")){
            for(; i<s.length() && j<p.length();) {
                if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                    i++;
                    j++;
                } else return false;
            }
            if(i<s.length() || j<p.length()) return false;
        }
        String[] compareStr = p.split("\\*");
        for(; i<s.length() && j<compareStr.length; j++) {
            for(int h=0; i<s.length() && h<compareStr[j].length();) {
                if(compareStr[j].charAt(h) == s.charAt(i) || compareStr[j].charAt(h) == '.') {
                    i++;
                    h++;
                    while (i>0 && i<s.length() && (s.charAt(i) == s.charAt(i-1) ||
                            (compareStr[j].endsWith(".") && p.endsWith("*")))) {
                        i++;
                    }
                } else if(h == compareStr[j].length()-1) {
                    h++;
                } else return false;
                /*while (i>0 && i<s.length() && (s.charAt(i) == s.charAt(i-1) ||
                        (compareStr[j].endsWith(".") && p.endsWith("*")))) {
                    i++;
                }*/
            }
        }
        if(i<s.length()) return false;
        return true;
    }

    public boolean isMatch2(String s, String p) {

        if (s == null || p == null) {
            return false;
        }
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*' && dp[0][i-1]) {
                dp[0][i+1] = true;
            }
        }
        for (int i = 0 ; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '.') {
                    dp[i+1][j+1] = dp[i][j];
                }
                if (p.charAt(j) == s.charAt(i)) {
                    dp[i+1][j+1] = dp[i][j];
                }
                if (p.charAt(j) == '*') {
                    if (p.charAt(j-1) != s.charAt(i) && p.charAt(j-1) != '.') {
                        dp[i+1][j+1] = dp[i+1][j-1];
                    } else {
                        dp[i+1][j+1] = (dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]);
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
