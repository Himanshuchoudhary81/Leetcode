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
    public int[] nextLargerNodes(ListNode head) {
        int index = 0 ;
        ListNode dummy = new ListNode(0) ;
        ListNode p1 = dummy ;
        dummy.next = head ;
        ListNode curr = head ;
        int count = 1 ;

        while( curr.next != null ){
          count ++ ;
          curr = curr.next ;
        }
        int arr[] = new int[count] ;

        for( int i = 1 ; i <= count ; i ++ ){
            p1 = p1.next ;
            ListNode p2 = p1.next ;
            for( int j = i + 1 ; p2 != null ; j ++ ){
                if( p2.val > p1.val  ){
                    arr[index] = p2.val ;
                    index ++ ;
                    break ;
                }
                p2= p2.next ;
            }
            if(p2 == null ){
                index ++ ;
            }
        }

        return arr ;
        
    }
}