package easy;

import util.ListNode;

/**
 * Created by ad on 2017/8/8.
 */
public class S_021 {
    /**
     * Merge two sorted linked lists and return it as a new list.
     * The new list should be made by splicing together the nodes of the first two lists.
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;

        while(l1!=null&&l2!=null){
            if(l1.val<l2.val) {
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            }else{
                p.next = l2;
                p = p.next;
                l2 = l2.next;
            }
        }

        if(l1!=null)
            p.next = l1;
        if(l2!=null)
            p.next = l2;

        return head.next;
    }
}