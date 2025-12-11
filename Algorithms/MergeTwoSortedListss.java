 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeTwoSortedListss {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode tmp= new ListNode(0);
       ListNode output = tmp;
       while(l1!=null && l2!=null){
           if(l1.val > l2.val){
               tmp.next = l2;
               l2 = l2.next;
           }else{
               tmp.next = l1;
               l1 = l1.next;
           }
           tmp = tmp.next;
       }
       if(l1!=null){
           tmp.next = l1;
       }
       if(l2!=null){
           tmp.next = l2;
       }
       return output.next;
    }
}