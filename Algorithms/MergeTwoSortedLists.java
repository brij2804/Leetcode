 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1!=null && l2!=null){
            ListNode head = new ListNode(0);
            ListNode oldHead = head;

            while(l1!=null && l2!=null){

                if(l1.val < l2.val){
                    ListNode newNode = new ListNode(l1.val);
                    head.next = newNode;
                    l1 = l1.next;
                    head = head.next;
                }else{
                    ListNode newNode =new ListNode(l2.val);
                    head.next = newNode;
                    l2 = l2.next;
                    head = head.next;
                }
            }

            while(l1!=null){
                ListNode newNode = new ListNode(l1.val);
                head.next = newNode;
                l1=l1.next;
                head = head.next;
            }

            while(l2!=null){
                ListNode newNode = new ListNode(l2.val);
                head.next = newNode;
                l2 = l2.next;
                head = head.next;
            }
            ListNode newHead = oldHead.next;
            oldHead.next = null;
            return newHead;
        }else if(l1!=null){
            return l1;
        }else if(l2!=null){
            return l2;
        }
        return null;
    }
}