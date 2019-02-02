package tmy.stringtype.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tangminyan on 2019/1/24.
 *
 * Substring with Concatenation of All Words
 */
public class SubstringConcatenationAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        if(s == null || s.length() == 0 || words == null || words.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> tmpList = new ArrayList<>();
        for(String w : words) {
            Pattern p = Pattern.compile(w);
            Matcher m = p.matcher(s);
            List<Integer> intMap = new ArrayList<>();
            while(m.find()) {
                intMap.add(m.start());
            }
            System.out.println(w + ":" +intMap);
            tmpList.add(intMap);
        }
        return findIndex(tmpList, words[0].length(), words.length);
    }

    private List<Integer> findIndex(List<List<Integer>> tmpList, int len, int num) {
        List<Integer> integerList = new ArrayList<>();
        for(int i=0; i<tmpList.size()-1; i++) {
            System.out.println("NO"+i+" : " + tmpList.get(i));
            for(int h : tmpList.get(i)) {
                System.out.println("element of i,h = "+h);
                HashSet<Integer> setList = new HashSet<>();
                for(int j=i+1; j<tmpList.size(); j++) {
                    System.out.println("compare j:" + tmpList.get(j));
                    if(tmpList.get(j).contains(h + len)) {
                        setList.add(h);
                        setList.add(h + len);
                    } else if(tmpList.get(j).contains(h - len)) {
                        setList.add(h);
                        setList.add(h - len);
                    }
                }
                System.out.println("after NO"+i+" : " + setList);
                System.out.println("------------------------");
                if(setList.size() == num) integerList.add(Collections.min(setList));
            }
        }
        return integerList;
    }
}
