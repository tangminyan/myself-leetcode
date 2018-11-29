package tmy.numtype.hard;

/**
 * Created by tangminyan on 2018/11/28.
 *
 * Median of Two Sorted Arrays
 */
//TODO
public class MedianofTwo {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sumArr = merge(nums1, nums2);
        if(sumArr.length%2 == 0) {
            return (sumArr[sumArr.length/2] + sumArr[sumArr.length/2-1])/2.0;
        } else {
            return sumArr[sumArr.length/2];
        }
    }

    private int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] sumArr = new int[m+n];
        int i=0, j=0, h=0;
        for (; i<m && j<n; h++) {
            if(nums1[i] <= nums2[j]) {
                sumArr[h] = nums1[i];
                i++;
            } else {
                sumArr[h] = nums2[j];
                j++;
            }
        }
        if(i<m) {
            for(; i<m; i++, h++) {
                sumArr[h] = nums1[i];
            }
        }
        if(j<n) {
            for(; j<n; j++, h++) {
                sumArr[h] = nums2[j];
            }
        }
        return sumArr;
    }

    /**
     *  OnLine
     * @param A
     * @param B
     * @return
     */
    public double findMedianSortedArrays2(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
    }

    public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
        if (aStart > A.length - 1) return B[bStart + k - 1];
        if (bStart > B.length - 1) return A[aStart + k - 1];
        if (k == 1) return Math.min(A[aStart], B[bStart]);

        int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
        if (aStart + k/2 - 1 < A.length) aMid = A[aStart + k/2 - 1];
        if (bStart + k/2 - 1 < B.length) bMid = B[bStart + k/2 - 1];

        if (aMid < bMid)
            return getkth(A, aStart + k/2, B, bStart,       k - k/2);// Check: aRight + bLeft
        else
            return getkth(A, aStart,       B, bStart + k/2, k - k/2);// Check: bRight + aLeft
    }
}
