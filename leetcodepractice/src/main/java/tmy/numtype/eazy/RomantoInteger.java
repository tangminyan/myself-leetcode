package tmy.numtype.eazy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangminyan on 2018/12/5.
 *
 * Roman to Integer
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class RomantoInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('M', 1000);
        romanMap.put('D', 500);
        romanMap.put('C', 100);
        romanMap.put('L', 50);
        romanMap.put('X', 10);
        romanMap.put('V', 5);
        romanMap.put('I', 1);
        int num = romanMap.get(s.charAt(s.length()-1));
        for(int i=s.length()-1; i>0; i--) {
            if(romanMap.get(s.charAt(i-1)) < romanMap.get(s.charAt(i))) num -= romanMap.get(s.charAt(i-1));
            else num += romanMap.get(s.charAt(i-1));
        }
        return num;
    }

}
