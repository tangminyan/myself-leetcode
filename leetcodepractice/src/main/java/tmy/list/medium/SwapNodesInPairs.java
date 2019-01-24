package tmy.list.medium;

import tmy.list.utils.ListNode;


/**
 * Created by tangminyan on 2019/1/21.
 *
 *  Swap Nodes in Pairs
 */
//TODO not finish
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode before = new ListNode(0);
        before.next = head;
        ListNode first = head;
        ListNode second;
        while (first.next != null && first.next.next != null) {
            second = first.next;
            first.next = second.next;
            second.next = first;
            before = first;
            first = first.next;
        }
        if(first.next.next == null) {
            before.next = first.next;
            first.next.next = first;
            first.next = null;
        }
        return head;
    }

}
