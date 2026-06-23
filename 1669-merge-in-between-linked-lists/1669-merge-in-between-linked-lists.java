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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p1 = list1 ;
        ListNode p2 = list1 ;
        ListNode p3 = list2 ;
        ListNode p4 = list2 ;

        for( int i = 0 ; i < b ; i ++ ){
            p2 = p2.next ;
        }

        for( int i = 0 ; i < a - 1 ; i ++ ){
            p1 = p1.next ;
        }
        
        while( p4.next != null ){
            p4 = p4.next ;
        }

        p1.next = p3 ;
        p4.next = p2.next ;

        return list1 ;
    }
}