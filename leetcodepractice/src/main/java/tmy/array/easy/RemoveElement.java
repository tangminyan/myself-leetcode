package tmy.array.easy;

/**
 * Created by tangminyan on 2019/1/24.
 *
 *  Remove Element
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int n : nums) {
            if(n != val) {
                nums[index++] = n;
            }
        }
        return index;
    }
}
