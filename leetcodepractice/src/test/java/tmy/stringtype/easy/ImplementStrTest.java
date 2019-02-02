package tmy.stringtype.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tangminyan on 2019/1/24.
 */
public class ImplementStrTest {

    @Test
    public void strStr() {
        ImplementStr implement = new ImplementStr();
        System.out.println(implement.strStr("aaaaa", "bba"));
    }
}