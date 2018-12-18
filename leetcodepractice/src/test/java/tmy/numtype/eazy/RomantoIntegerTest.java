package tmy.numtype.eazy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tangminyan on 2018/12/5.
 */
public class RomantoIntegerTest {
    @Test
    public void test() {
        RomantoInteger romantoInteger = new RomantoInteger();
        System.out.println(romantoInteger.romanToInt("MCMXCIV"));
    }

}