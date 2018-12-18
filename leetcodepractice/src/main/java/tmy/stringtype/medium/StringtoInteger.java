package tmy.stringtype.medium;

import java.util.regex.Pattern;

/**
 * Created by tangminyan on 2018/11/30.
 *  String to Integer
 */
public class StringtoInteger {
    public int myAtoi(String str) {
        if (str.trim() == null || str.trim().length() == 0) return 0;
        str = str.trim();
        StringBuffer tmpStr;
        Double result;
        boolean beyond = true;
        if(str.charAt(0) == '-') beyond = false;
        if(str.charAt(0) == '-' || str.charAt(0) == '+')  str = str.substring(1);
        tmpStr = meddelProcess(str);
        if(tmpStr.length() == 0) return 0;
        result = Double.parseDouble(tmpStr.toString());
        if(result > Integer.MAX_VALUE && beyond) return Integer.MAX_VALUE;
        if(result > Integer.MAX_VALUE && !beyond) return Integer.MIN_VALUE;
        return beyond ? (int)(0 + result) : (int)(0 - result);
    }

    private StringBuffer meddelProcess(String str) {
        StringBuffer tmpStr = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9') break;
            tmpStr.append(str.charAt(i)).toString();
        }
        return tmpStr;
    }

    public int myAtoi2(String str) {
        int index = 0, sign = 1, total = 0;
        //1. Empty string
        if(str.length() == 0) return 0;

        //2. Remove Spaces
        while(str.charAt(index) == ' ' && index < str.length())
            index ++;

        //3. Handle signs
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index) == '+' ? 1 : -1;
            index ++;
        }

        //4. Convert number and avoid overflow
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index ++;
        }
        return total * sign;
    }
}
