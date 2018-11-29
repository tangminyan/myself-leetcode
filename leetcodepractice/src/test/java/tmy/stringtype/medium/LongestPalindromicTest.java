package tmy.stringtype.medium;

import org.junit.Test;

/**
 * Created by tangminyan on 2018/11/29.
 */
public class LongestPalindromicTest {
    @Test
    public void test() {
        LongestPalindromic palindromic = new LongestPalindromic();
        String s = "kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeuea" +
                "fubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerk" +
                "mjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgn" +
                "myjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyu" +
                "olostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnq" +
                "pbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjl" +
                "rnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmt" +
                "lssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrz" +
                "qsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjou" +
                "mczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv";
        String s1 = "cbbd";
        long startTime = System.currentTimeMillis();
        System.out.println(palindromic.longestPalindrome(s));
        long endTime = System.currentTimeMillis();
        System.out.println("方法一程序运行时间：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        System.out.println(palindromic.longestPalindrome2(s));
        endTime = System.currentTimeMillis();
        System.out.println("方法二程序运行时间：" + (endTime - startTime) + "ms");
    }

}
