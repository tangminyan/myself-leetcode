package tmy.stringtype.easy;

import java.util.Stack;

/**
 * Created by tangminyan on 2019/1/21.
 *
 *  Valid Parentheses
 *  Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 *  An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if(s == null || s.length()%2 != 0) return false;
        Stack<Character> strStack = new Stack<>();
        Stack<Character> strStack2 = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            strStack.push(s.charAt(i));
        }
        while (!strStack.empty()) {
            strStack2.push(strStack.pop());
            while (!strStack.empty() && !strStack2.empty() && checkCouple(strStack.peek(), strStack2.peek())) {
                strStack.pop();
                strStack2.pop();
            }
        }
        if(!strStack2.empty()) return false;
        return true;
    }

    private boolean checkCouple(Character peek, Character peek1) {
        if((peek == '(' && peek1 == ')') || (peek == '[' && peek1 == ']') || (peek == '{' && peek1 == '}')) {
            return true;
        }
        return false;
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
