package tmy.stringtype.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tangminyan on 2019/1/21.
 */
public class ValidParenthesesTest {
    @Test
    public void test() {
        ValidParentheses parentheses = new ValidParentheses();
        System.out.println(parentheses.isValid(""));
        System.out.println(parentheses.isValid2(""));
    }

}