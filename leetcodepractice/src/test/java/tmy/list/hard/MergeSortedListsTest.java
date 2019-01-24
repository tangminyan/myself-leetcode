package tmy.list.hard;

import org.junit.Test;
import tmy.list.medium.SwapNodesInPairs;
import tmy.list.utils.ListNode;



/**
 * Created by tangminyan on 2019/1/21.
 */
public class MergeSortedListsTest {

    @Test
    public void test() {
        MergeSortedLists sorted = new MergeSortedLists();
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(2);
        ListNode node0 = new ListNode(1);
        node5.next = node6;
        node4.next = node5;
        node3.next = node4;

        node1.next = node2;
        node0.next = node1;

        ListNode[] listNodes = {node0, node3};

        System.out.println(sorted.mergeKLists(listNodes));

        SwapNodesInPairs pairs = new SwapNodesInPairs();
        pairs.swapPairs(node3);
    }

}