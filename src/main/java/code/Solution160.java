package code;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ha = headA, hb = headB;
        while (ha != hb) {
            if (ha != null) {
                ha = ha.next;
            } else {
                ha = headB;
            }
            if (hb != null) {
                hb = hb.next;
            } else {
                hb = headA;
            }
        }
        return ha;
    }
}
