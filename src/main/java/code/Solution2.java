package code;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, current = result;
        int cf = 0;
        while (p != null || q != null) {
            int x = 0, y = 0;
            if (p != null) {
                x = p.val;
            }
            if (q != null) {
                y = q.val;
            }
            int sum = cf + x + y;
            cf = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (cf > 0) {
            current.next = new ListNode(cf);
        }
        return result.next;
    }
}
