package tmy.axis.medium;

import org.junit.Test;

/**
 * Created by tangminyan on 2018/12/4.
 */
public class ContainerMostWaterTest {
    @Test
    public void test() {
        ContainerMostWater container = new ContainerMostWater();
        int[] height = {1,1};
        System.out.println(container.maxArea(height));
    }

}
