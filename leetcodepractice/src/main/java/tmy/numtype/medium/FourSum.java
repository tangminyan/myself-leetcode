package tmy.numtype.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tangminyan on 2018/12/18.
 *
 *  4Sum
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> intList = new ArrayList<List<Integer>>();
        if(nums == null || nums.length < 4) return intList;
        Arrays.sort(nums);
        int start, end2, end;
        for(int i=0; i<nums.length-3; i++) {
            end = nums.length - 1;
            while (nums[i] + nums[end-2] + nums[end-1] + nums[end] > target && end>i+2) end--;
            while (nums[i] + nums[i+1] + nums[i+2] + nums[end] > target && i<end-2) i++;
            start = i+1;
            end2 = end - 1;
            while (end2 > start) {
                if(nums[i] + nums[start] + nums[end] + nums[end2] == target) {
                    intList.add(Arrays.asList(nums[i], nums[start], nums[end], nums[end2]));
                    while(start<end2 && nums[start] == nums[start+1]) start++;
                    while(start<end2 && nums[end2] == nums[end2-1]) end2--;
                } else if(nums[i] + nums[start] + nums[end] + nums[end2] < target) start++;
                else end2--;
            }
        }
        return intList;
    }

    public List<List<Integer>> fourSum2(int[] num, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(num.length<4)return ans;
        Arrays.sort(num);
        for(int i=0; i<num.length-3; i++){
            if(num[i]+num[i+1]+num[i+2]+num[i+3]>target)break; //first candidate too large, search finished
            if(num[i]+num[num.length-1]+num[num.length-2]+num[num.length-3]<target)continue; //first candidate too small
            if(i>0&&num[i]==num[i-1])continue; //prevents duplicate result in ans list
            for(int j=i+1; j<num.length-2; j++){
                if(num[i]+num[j]+num[j+1]+num[j+2]>target)break; //second candidate too large
                if(num[i]+num[j]+num[num.length-1]+num[num.length-2]<target)continue; //second candidate too small
                if(j>i+1&&num[j]==num[j-1])continue; //prevents duplicate results in ans list
                int low=j+1, high=num.length-1;
                while(low<high){
                    int sum=num[i]+num[j]+num[low]+num[high];
                    if(sum==target){
                        ans.add(Arrays.asList(num[i], num[j], num[low], num[high]));
                        while(low<high&&num[low]==num[low+1])low++; //skipping over duplicate on low
                        while(low<high&&num[high]==num[high-1])high--; //skipping over duplicate on high
                        low++;
                        high--;
                    }
                    //move window
                    else if(sum<target)low++;
                    else high--;
                }
            }
        }
        return ans;
    }
}
