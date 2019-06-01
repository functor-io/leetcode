/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n == 0){
            return head;
        }
        
        ListNode first = head;
        ListNode second = head;
        ListNode prev = null;
        for(int i =0; i<n-1;i++){
            if(second!= null){
            second = second.next;
            }else{
                return head;
            }
        }
        while(second.next != null){
            prev = first;
            first = first.next;
            second = second.next;
        }
        if(first == head){
            head = first.next;
            first.next = null;
        } else{
        prev.next = first.next;
        first.next = null;
        }
        return head;
    }
}
