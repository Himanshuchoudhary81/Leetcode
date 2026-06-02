/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0 ;
        ListNode curr = head ;
        while( curr != null ){
            count ++ ;
            curr = curr.next ;
        }
        if( count == 1 ){
            return null ;
        }

        ListNode dummy = new ListNode(0) ;
        dummy.next = head ;
        ListNode prev = dummy ;
        for( int i = 1 ; i <= count - n ; i ++ ){
            prev=prev.next;
        }
        prev.next = prev.next.next ;
        return dummy.next ;
    }
}