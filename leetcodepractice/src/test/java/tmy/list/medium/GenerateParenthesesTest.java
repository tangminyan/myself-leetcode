package tmy.list.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tangminyan on 2019/1/21.
 */
public class GenerateParenthesesTest {

    @Test
    public void generateParenthesis() {
        GenerateParentheses parentheses = new GenerateParentheses();
        System.out.println(parentheses.generateParenthesis(3));
    }

}