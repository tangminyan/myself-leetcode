package tmy.numtype.medium;

import org.junit.Test;

/**
 * Created by tangminyan on 2018/12/18.
 */
public class FourSumTest {
    @Test
    public void test() {
        FourSum fourSum = new FourSum();
        System.out.println(fourSum.fourSum2(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }
}