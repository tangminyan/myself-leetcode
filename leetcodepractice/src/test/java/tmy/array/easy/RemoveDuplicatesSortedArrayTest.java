package tmy.array.easy;

import org.junit.Test;

import javax.sound.midi.Soundbank;

import static org.junit.Assert.*;

/**
 * Created by tangminyan on 2019/1/24.
 */
public class RemoveDuplicatesSortedArrayTest {

    @Test
    public void removeDuplicates() {
        RemoveDuplicatesSortedArray moveArray = new RemoveDuplicatesSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = moveArray.removeDuplicates2(nums);
        System.out.println(result);
        moveArray.display(nums, result);
    }
}