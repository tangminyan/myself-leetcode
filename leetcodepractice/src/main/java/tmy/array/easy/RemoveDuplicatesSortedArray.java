package tmy.array.easy;

/**
 * Created by tangminyan on 2019/1/24.
 *
 *  Remove Duplicates from Sorted Array
 */
public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < nums.length - 1; i++) {
            while(nums[i] == nums[i+1] && nums[i] < Integer.MAX_VALUE) {
                moveToEnd(nums, i+1);
                len--;
            }
        }
        return len;
    }

    private void moveToEnd(int[] nums, int toBeMove) {
        for(int i = toBeMove; i < nums.length-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = Integer.MAX_VALUE;
    }

    public void display(int[] nums, int r) {
        for (int i = 0; i < r; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates2(int[] nums) {
        int index = 0;
        for(int n : nums) {
            if(index == 0 || n > nums[index-1]) {
                nums[index++] = n;
            }
        }
        return index;
    }
}
