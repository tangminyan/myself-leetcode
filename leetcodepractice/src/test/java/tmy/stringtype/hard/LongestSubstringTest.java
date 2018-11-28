package tmy.stringtype.hard;

import org.junit.Test;

/**
 * Created by tangminyan on 2018/11/27.
 */
public class LongestSubstringTest {
    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubstring longestSubstring = new LongestSubstring();
        int n = longestSubstring.lengthOfLongestSubstring("jbpnbwwd");
        System.out.println(n);
    }
}
