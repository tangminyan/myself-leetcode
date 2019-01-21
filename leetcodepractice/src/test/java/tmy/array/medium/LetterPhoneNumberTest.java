package tmy.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tangminyan on 2018/12/18.
 */
public class LetterPhoneNumberTest {
    @Test
    public void test() {
        LetterPhoneNumber letterPhoneNumber = new LetterPhoneNumber();
        long startTime = System.currentTimeMillis();
        System.out.println(letterPhoneNumber.letterCombinations2("2348576"));
        long endTime = System.currentTimeMillis();
        System.out.println("方法一程序运行时间：" + (endTime - startTime) + "ms");
        startTime = System.currentTimeMillis();
        System.out.println(letterPhoneNumber.letterCombinations3("2348576"));
        endTime = System.currentTimeMillis();
        System.out.println("方法二程序运行时间：" + (endTime - startTime) + "ms");
    }

}