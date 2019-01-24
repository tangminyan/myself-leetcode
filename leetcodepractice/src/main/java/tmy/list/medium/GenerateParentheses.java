package tmy.list.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by tangminyan on 2019/1/21.
 *
 *  Generate Parentheses
 *  For example, given n = 3, a solution set is:
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */
public class GenerateParentheses {

    List<String> list = new ArrayList<String>();
    int num;

    public List<String> generateParenthesis(int n) {
        num = n;
        getParentheses("", 0, 0);
        return list;
    }

    public void getParentheses(String str, int openNum, int closeNum){
        if(openNum == num && closeNum == num) {
            list.add(str);
            return;
        }
        if(openNum < num) {
            getParentheses(new StringBuilder(str + "(").toString(), openNum + 1, closeNum);
        }
        if(closeNum < openNum) {
            getParentheses(new StringBuilder(str + ")").toString(), openNum, closeNum + 1);
        }
    }
}
