/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode oldHead = head;
        int counter=0;
        Map<Integer,ListNode> map = new HashMap<>();

        if(head!=null){
            counter++;
            map.put(counter,head);
            while(head.next!=null){
                head = head.next;
                counter++;
                map.put(counter,head);
            }
            int beforeIndex = counter-n;

            if(beforeIndex==0){
                if(n==1){// only one element in the list and removing it
                    return null;
                }else{
                    ListNode newHead = oldHead.next;
                    oldHead.next = null;
                    return newHead;
                }
            }
            if(beforeIndex>0){
                // remove the last element
                if(n==1){
                    ListNode beforeNode = map.get(beforeIndex);
                    beforeNode.next = null;
                    return oldHead;
                }else{
                    ListNode beforeNode = map.get(beforeIndex);
                    ListNode afterNode = map.get(beforeIndex+2);
                    beforeNode.next = afterNode;
                    ListNode currentNode = map.get(beforeIndex+1);
                    currentNode.next = null;
                    return oldHead;
                }
            }
        }

        return oldHead;

    }
}