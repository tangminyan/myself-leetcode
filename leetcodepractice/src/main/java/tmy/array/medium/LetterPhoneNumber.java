package tmy.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by tangminyan on 2018/12/18.
 *
 *  Letter Combinations of a Phone Number
 */
public class LetterPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return new ArrayList<>();
        Map<Character, List> map = new HashMap<Character, List>();
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));
        char[] charArr = digits.toCharArray();
        if(charArr.length == 1) return map.get(charArr[0]);
        List<String> resList = new ArrayList<>();
        resList = map.get(charArr[0]);
        for(int i=1; i<charArr.length; i++) {
            resList = mergeToOne(resList, map.get(charArr[i]));
        }
        return resList;
    }
    private List<String> mergeToOne(List<String> list1, List<String> list2) {
        List<String> mergeList = new ArrayList<String>();
        for(String s : list1) {
            for(String t : list2) {
                StringJoiner joiner = new StringJoiner("");
                joiner.add(s);
                joiner.add(t);
                mergeList.add(joiner.toString());
            }
        }
        return mergeList;
    }

    public List<String> letterCombinations2(String digits) {
        LinkedList<String> result = new LinkedList<>();
        String[] letters = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        for(int i=0; i<digits.length(); i++) {
            while (result.peek().length() == i) {
                String tmp = result.remove();
                for (char s : letters[Character.getNumericValue(digits.charAt(i))].toCharArray()) {
                    result.add(tmp + s);
                }
            }
        }
        return result;
    }

    public List<String> letterCombinations3(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
    }
}
