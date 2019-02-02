package tmy.stringtype.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tangminyan on 2019/1/24.
 *
 *  Implement strStr()
 */
public class ImplementStr {
    public int strStr(String haystack, String needle) {
        Pattern pattern = Pattern.compile(needle);
        Matcher matcher = pattern.matcher(haystack);
        if(matcher.find()) {
            return matcher.start();
        }
        return -1;
    }

    //TODO to be remember
    public int strStr2(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
}
