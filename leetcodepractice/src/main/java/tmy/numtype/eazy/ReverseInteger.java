package tmy.numtype.eazy;

import java.math.BigInteger;
import java.util.Stack;

/**
 * Created by tangminyan on 2018/11/29.
 *
 *  Reverse Integer
 */
public class ReverseInteger {
    public int reverse(int x) {
        String s = "" + x;
        double tmp = 0;
        Stack<Integer> numStack = new Stack<Integer>();
        if(x < 0){
            s = s.substring(1);
        }
        for(int i=0; i<s.length(); i++){
            numStack.push(Integer.parseInt("" + s.charAt(i)));
        }
        for(int i=s.length()-1; !numStack.empty(); i--) {
            int num = numStack.pop();
            tmp += num * Math.pow(10, i);
            if ((int)(tmp) != tmp) {
                return 0;
            }
        }
        return x>0 ? (int)tmp : (int)(0-tmp);
    }
}
