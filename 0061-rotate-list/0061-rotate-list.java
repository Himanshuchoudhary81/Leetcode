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
    public ListNode rotateRight(ListNode head, int k) {
        if( head == null || head.next == null || k == 0) return head ;
        int length = 1 ;
        ListNode p1 = head ;
        ListNode p2 = head ;

        while( p2.next != null ){
            p2 = p2.next ;
            length = length + 1 ;
        }
        p2.next = head ;

        k = k % length ;
        int newtailindex = length - k ;

        ListNode newtail = head ;

        for( int i = 1 ; i < newtailindex ; i ++ ){
            newtail = newtail.next ;
        }
        
        ListNode newhead = newtail.next ;

        newtail.next = null ;
        return newhead ;
    }
}