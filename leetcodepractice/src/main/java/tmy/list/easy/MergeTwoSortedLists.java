package tmy.list.easy;

import tmy.list.utils.ListNode;

/**
 * Created by tangminyan on 2019/1/21.
 *
 * Merge Two Sorted Lists
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode tmp = resultNode;
        while (l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        if(l1 != null) {
            tmp.next = l1;
        }
        if(l2 != null) {
            tmp.next = l2;
        }
        return resultNode.next;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }
}
