package tmy.numtype.medium;

import java.util.Arrays;

/**
 * Created by tangminyan on 2018/12/18.
 *
 *  3Sum Closest
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int minus = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++) {
            int p = i+1, q = nums.length - 1;
            while (p<q) {
                int sum = nums[i] + nums[p] + nums[q];
                if(Math.abs(sum - target) < minus) {
                    minus = Math.abs(sum - target);
                    result = sum;
                }
                if(sum > target) q--;
                else if(sum < target) p++;
                else return result;
            }
        }
        return result;
    }

}
