package tmy.numtype.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by tangminyan on 2018/12/6.
 *
 * 3Sum
 */
public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> intList = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0) return intList;
        Arrays.sort(nums);
        int begin, end, sum;
        for(int i=0; i<nums.length-1; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            sum = 0-nums[i];
            begin = i+1;
            end = nums.length-1;
            for(; begin<end; ) {
                if(nums[begin] + nums[end] == sum) {
                    intList.add(Arrays.asList(nums[i], nums[begin], nums[end]));
                    while (begin<end && nums[begin+1] == nums[begin]) begin++;
                    while (begin<end && nums[end-1] == nums[end]) end--;
                    begin++; end--;
                }else if (nums[begin] + nums[end] < sum) begin++;
                else end--;
            }
        }
        return intList;
    }



    public List<List<Integer>> threeSum2(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}
