package tmy.stringtype.hard;

import org.junit.Test;
import tmy.stringtype.medium.LongestSubstring;

/**
 * Created by tangminyan on 2018/11/27.
 */
public class LongestSubstringTest {
    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubstring longestSubstring = new LongestSubstring();
        long startTime = System.currentTimeMillis();
        int n = longestSubstring.lengthOfLongestSubstring("jbpnbwwdfffffaaasefregtrhtrgsfgerg");
        long endTime = System.currentTimeMillis();
        System.out.println("方法一程序运行时间：" + (endTime - startTime) + "ms");
        startTime = System.currentTimeMillis();
        n = longestSubstring.lengthOfLongestSubstring2("jbpnbwwdfffffaaasefregtrhtrgsfgerg");
        endTime = System.currentTimeMillis();
        System.out.println("方法二程序运行时间：" + (endTime - startTime) + "ms");

    }
}
