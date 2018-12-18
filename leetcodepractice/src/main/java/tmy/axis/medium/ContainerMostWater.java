package tmy.axis.medium;

/**
 * Created by tangminyan on 2018/12/4.
 *
 * Container With Most Water
 */
public class ContainerMostWater {
    public int maxArea(int[] height) {
        int water = 0;
        int tmp;
        int index = 0;
        for(int i = 1; i<height.length-1; i++) {
            for(int j = index+1; j<height.length; j++) {
                tmp = (j - index) * Math.min(height[j], height[index]);
                if(tmp > water) water = tmp;
            }
        }
        return water;
    }
}
