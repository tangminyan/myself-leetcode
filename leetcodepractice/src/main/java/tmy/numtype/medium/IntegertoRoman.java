package tmy.numtype.medium;

/**
 * Created by tangminyan on 2018/12/4.
 *
 *  Integer to Roman
 *  Symbol       Value
 *    I             1
 *    V             5
 *    X             10
 *    L             50
 *    C             100
 *    D             500
 *    M             1000
 */
public class IntegertoRoman {
    String[] ge = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] shi = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] bai = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] qian = {"M"};
    String[][] roman = {ge, shi, bai, qian};
    public String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; num> 0; i++) {
            if (num%10==0) {
                builder.append(roman[i++][num%10]);

            } else {
                builder.append(roman[i][num%10-1]);
                num /= 10;
            }

        }
        return builder.reverse().toString();
    }

    //TODO
    public String intToRoman2(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
}
