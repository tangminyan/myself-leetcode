package tmy.list.medium;

import org.junit.Test;

/**
 * Created by tangminyan on 2018/12/18.
 */
public class RemoveNodeEndListTest {
    @Test
    public void test() {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        node3.next = node4;
        node2.next = node3;
        node1.next = node2;
        node.next = node1;
        while (node != null && node.next != null) {
            System.out.println(node.val);
            node = node.next;
        }
       /* RemoveNodeEndList nodeEndList = new RemoveNodeEndList();
        ListNode resultList = nodeEndList.removeNthFromEnd(node, 2);
        while (resultList.next != null) {
            System.out.println(resultList.val);
            resultList = resultList.next;
        }*/
    }

}