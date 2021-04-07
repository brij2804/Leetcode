/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryover = 0;
        ListNode head = null;
        ListNode tail = null;

        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val + carryover;
            int newdata = sum % 10;

            carryover = sum/10;

            ListNode node= new ListNode(newdata);
            if(head==null){
                head=node;
                tail = node;
            }else{
                tail.next = node;
                tail = node;
            }

            l1= l1.next;
            l2 = l2.next;
        }

        if(l1!=null){

            while(l1!=null){
                int sum = l1.val + carryover;
                int newdata = sum % 10;

                carryover = sum/10;

                ListNode node= new ListNode(newdata);
                if(head==null){
                    head=node;
                    tail = node;
                }else{
                    tail.next = node;
                    tail = node;
                }

                l1= l1.next;
            }
        }

        if(l2!=null){

            while(l2!=null){
                int sum = l2.val + carryover;
                int newdata = sum % 10;

                carryover = sum/10;

                ListNode node= new ListNode(newdata);
                if(head==null){
                    head=node;
                    tail = node;
                }else{
                    tail.next = node;
                    tail = node;
                }

                l2= l2.next;
            }
        }

        if(carryover!=0){

            ListNode node= new ListNode(carryover);
            if(head==null){
                head=node;
                tail = node;
            }else{
                tail.next = node;
                tail = node;
            }
        }

        return head;
    }
}