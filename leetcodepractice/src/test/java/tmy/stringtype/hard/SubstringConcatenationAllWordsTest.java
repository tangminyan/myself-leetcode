package tmy.stringtype.hard;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tangminyan on 2019/1/24.
 */
public class SubstringConcatenationAllWordsTest {

    @Test
    public void findSubstring() {
        SubstringConcatenationAllWords allWords = new SubstringConcatenationAllWords();
        System.out.println(allWords.findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"}));
    }
}