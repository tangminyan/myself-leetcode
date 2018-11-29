package tmy.stringtype.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by tangminyan on 2018/11/27.
 *
 *  Longest Substring Without Repeating Characters
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        char[] tmpArr = s.toCharArray();
        Set<Character> tmpSet = new HashSet<Character>();
        for(int i = 0; i < tmpArr.length; i++) {
            for(int j = i; j<tmpArr.length; j++) {
                if(!tmpSet.add(tmpArr[j])) {
                    if(length < tmpSet.size()) {
                        length = tmpSet.size();
                    }
                    tmpSet = new HashSet<Character>();
                    break;
                }
            }

        }
        return length>=tmpSet.size() ? length : tmpSet.size();
    }

    public int lengthOfLongestSubstring2(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
