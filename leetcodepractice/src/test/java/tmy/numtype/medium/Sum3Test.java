package tmy.numtype.medium;

import org.junit.Test;


/**
 * Created by tangminyan on 2018/12/6.
 */
public class Sum3Test {
    @Test
    public void test() {
        Sum3 sum3 = new Sum3();
        int[] ints = {1,-1,-1,0};
        System.out.println(sum3.threeSum(ints));
    }

}