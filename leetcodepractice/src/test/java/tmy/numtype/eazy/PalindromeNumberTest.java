package tmy.numtype.eazy;

import org.junit.Test;

/**
 * Created by tangminyan on 2018/11/30.
 */
public class PalindromeNumberTest {
    @Test
    public void test() {
        PalindromeNumber number = new PalindromeNumber();
        long startTime = System.currentTimeMillis();
        System.out.println(number.isPalindrome(10));
        long endTime = System.currentTimeMillis();
        System.out.println("方法1程序运行时间：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        System.out.println(number.isPalindrome2(10));
        endTime = System.currentTimeMillis();
        System.out.println("方法2程序运行时间：" + (endTime - startTime) + "ms");
    }
}
