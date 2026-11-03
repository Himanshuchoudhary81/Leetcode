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
    public ListNode oddEvenList(ListNode head) {

        if( head == null || head.next == null){
            return head ;
        }
        
        ListNode A = head ;
        ListNode B = head.next ;
        ListNode C = head.next ;

        while( B != null && B.next != null ){
            A.next = B.next ;
            A = A.next ;
            B.next = A.next ;
            B = B.next ;
        }

        A.next = C ;

        return head ;
    }
}