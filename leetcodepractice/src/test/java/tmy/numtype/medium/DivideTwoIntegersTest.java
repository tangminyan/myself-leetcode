package tmy.numtype.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tangminyan on 2019/1/24.
 */
public class DivideTwoIntegersTest {

    @Test
    public void divide() {
        DivideTwoIntegers divide = new DivideTwoIntegers();
        System.out.println(divide.divide(7, -3));
    }
}