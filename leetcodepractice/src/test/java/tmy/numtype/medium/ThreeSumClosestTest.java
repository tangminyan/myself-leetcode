package tmy.numtype.medium;


import org.junit.Test;

/**
 * Created by tangminyan on 2018/12/18.
 */
public class ThreeSumClosestTest {

    @Test
    public void test() {
        ThreeSumClosest closest = new ThreeSumClosest();
        int[] nums = {1,1,-1,-1,3,3};
        System.out.println(closest.threeSumClosest(nums, 3));
    }
}