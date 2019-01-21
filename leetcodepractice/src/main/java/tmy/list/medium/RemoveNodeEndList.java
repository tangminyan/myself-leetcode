package tmy.list.medium;

/**
 * Created by tangminyan on 2018/12/18.
 *
 *  Remove Nth Node From End of List
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class RemoveNodeEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode next = head;
        while (next.next != null) {
            count++;
            next = next.next;
        }
        next = head;
        if(n == count) {
            while (head.next != null) {
                if(head.next.next == null) {
                    head.next.next = null;
                    return next;
                }

            }
        } else {
            for(int i=0; i<count-n; i++) {
                head = head.next;
            }
            head.next = head.next.next.next;
        }
        return next;
    }

}
