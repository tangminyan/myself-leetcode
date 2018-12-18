package tmy.stringtype.hard;

import org.junit.Test;

/**
 * Created by tangminyan on 2018/12/3.
 */
public class RegularExpressionTest {
    @Test
    public void test() {
        RegularExpression expression = new RegularExpression();
        System.out.println(expression.isMatch("aaa", "ab*a"));
    }

}
