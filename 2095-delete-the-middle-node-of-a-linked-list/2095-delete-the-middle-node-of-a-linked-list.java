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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null ;
        }
        
       int count = 1 ;
       ListNode curr = head ;
       ListNode dummy = head ;
       ListNode dummy2 = head ;

    while( curr.next != null ){
     count++ ;
    curr = curr.next ;
    }

    int h = count / 2 ;
    for( int i = 1 ; i < h ; i ++ ){
        dummy2 = dummy2.next ;
    }

    dummy2.next = dummy2.next.next ;
    return head ;
    }
}