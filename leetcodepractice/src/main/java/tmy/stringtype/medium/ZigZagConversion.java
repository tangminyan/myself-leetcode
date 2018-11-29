package tmy.stringtype.medium;

/**
 * Created by tangminyan on 2018/11/29.
 *
 *  ZigZag Conversion
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        StringBuffer result = new StringBuffer();
        int tepGap;
        for(int i = 1, j = i-1; i < numRows+1;) {
            tepGap = 2 * (numRows - i);
            if(j < s.length()) {
                result.append(s.charAt(j));
                j += tepGap;
                if(j < s.length() && 2 * (numRows - 1) != tepGap) {
                    if(tepGap != 0) {
                        result.append(s.charAt(j));
                    }
                    j += (2 * (numRows - 1) - tepGap);
                }
            } else {
                i++;
                j = i-1;
            }
        }
        return result.toString();
    }

    public String convert2(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);
            for (int idx = numRows-2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }
}
