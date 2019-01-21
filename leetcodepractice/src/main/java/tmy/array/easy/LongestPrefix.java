package tmy.array.easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by tangminyan on 2018/12/5.
 *
 * Longest Common Prefix
 */
public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length ==0) return "";
        if(strs.length == 1) return strs[0];
        StringBuilder builder = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i=0; i<first.length(); i++) {
            if(i<last.length() && last.charAt(i) == first.charAt(i)) builder.append(first.charAt(i));
            else break;
        }
        return builder.toString();
    }

    public String longestCommonPrefix2(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
}
