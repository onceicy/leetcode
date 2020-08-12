package code;

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        ListNode temp = null;
        while (curr != null){
            temp = curr.next;
            curr.next = pre; 
            pre = curr; 
            curr = temp;
        }
        return pre;
    }
}
