package tmy.stringtype.medium;

import org.junit.Test;

/**
 * Created by tangminyan on 2018/11/29.
 */
public class ZigZagConversionTest {
    @Test
    public void test() {
        ZigZagConversion conversion = new ZigZagConversion();
        String s = "PAYPALISHIRING";
        long startTime = System.currentTimeMillis();
        System.out.println(conversion.convert2(s, 4));
        long endTime = System.currentTimeMillis();
        System.out.println("方法一程序运行时间：" + (endTime - startTime) + "ms");
    }

}
