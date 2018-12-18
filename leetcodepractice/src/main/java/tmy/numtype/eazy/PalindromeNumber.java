package tmy.numtype.eazy;

import java.util.Stack;

/**
 * Created by tangminyan on 2018/11/30.
 *
 *  Palindrome Number
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        Stack<Integer> intStack = new Stack<Integer>();
        int num0 = x;
        while (num0 != 0) {
            intStack.push(num0%10);
            num0 /= 10;
        }
        int size = intStack.size();
        for(int i = 0; i<size/2; i++, x /= 10) {
            if(intStack.pop() != x%10) return false;
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}
