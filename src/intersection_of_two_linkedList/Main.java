package intersection_of_two_linkedList;

import Listnode.ListNode;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(1);
        head.next.next = new ListNode(8);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(6);
        head1.next.next = new ListNode(1);
        head1.next.next.next = new ListNode(8);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next = new ListNode(5);

        getIntersectionNode(head, head1);

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    }
}
