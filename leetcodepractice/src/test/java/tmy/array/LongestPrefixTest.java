package tmy.array;

import org.junit.Test;
import tmy.array.easy.LongestPrefix;

/**
 * Created by tangminyan on 2018/12/5.
 */
public class LongestPrefixTest {
    @Test
    public void test() {
        LongestPrefix longestPrefix = new LongestPrefix();
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestPrefix.longestCommonPrefix(strs));
    }

}