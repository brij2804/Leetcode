/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(k == 0) return head;
        int len = 0;
        ListNode current = head;
        ListNode last = null;
        while(current != null) {
            len++;
            if(current.next == null) last = current;
            current = current.next;
        }

        k %= len;
        if(k == len) return head;
        if(k == 0) return head;
        current = head;
        for(int i = 0; i < len - k - 1; i++) {
            current = current.next;
        }
        ListNode next = current.next;
        current.next = null;
        last.next = head;
        return next;
    }
}