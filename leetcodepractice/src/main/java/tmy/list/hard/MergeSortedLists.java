package tmy.list.hard;

import tmy.list.utils.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by tangminyan on 2019/1/21.
 *
 * Merge k Sorted Lists
 */


public class MergeSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (ListNode n : lists) {
            if(n != null) {
                while (n.next != null) {
                    queue.add(n.val);
                    n = n.next;
                }
                queue.add(n.val);
            }
        }
        System.out.println("queue : " + queue);
        ListNode node = new ListNode(0);
        ListNode tmp = node;
        while (!queue.isEmpty()) {
            tmp.next = new ListNode(queue.poll());
            tmp = tmp.next;
        }
        return node.next;
    }

}
