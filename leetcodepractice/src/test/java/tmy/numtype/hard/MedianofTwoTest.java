package tmy.numtype.hard;

import org.junit.Test;

/**
 * Created by tangminyan on 2018/11/29.
 */
public class MedianofTwoTest {
    @Test
    public void test() {
        MedianofTwo two = new MedianofTwo();
        int[] nums1 = {1, 2, 5, 8, 23, 45, 75};
        int[] nums2 = {3, 4, 7, 9, 12, 22, 33, 56};
        long startTime = System.currentTimeMillis();
        System.out.println(two.findMedianSortedArrays(nums1, nums2));
        long endTime = System.currentTimeMillis();
        System.out.println("方法一程序运行时间：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        System.out.println(two.findMedianSortedArrays2(nums1, nums2));
        endTime = System.currentTimeMillis();
        System.out.println("方法二程序运行时间：" + (endTime - startTime) + "ms");
    }

}
