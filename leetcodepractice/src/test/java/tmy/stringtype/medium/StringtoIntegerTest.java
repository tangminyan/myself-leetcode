package tmy.stringtype.medium;

import org.junit.Test;

/**
 * Created by tangminyan on 2018/11/30.
 */
public class StringtoIntegerTest {
    @Test
    public void test() {
        StringtoInteger stringtoInteger = new StringtoInteger();
        long startTime = System.currentTimeMillis();
        System.out.println(stringtoInteger.myAtoi("    +12339766436543-1  reg  "));
        long endTime = System.currentTimeMillis();
        System.out.println("方法1程序运行时间：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        System.out.println(stringtoInteger.myAtoi2("    +12339766436543-1  reg  "));
        endTime = System.currentTimeMillis();
        System.out.println("方法2程序运行时间：" + (endTime - startTime) + "ms");
    }
}
