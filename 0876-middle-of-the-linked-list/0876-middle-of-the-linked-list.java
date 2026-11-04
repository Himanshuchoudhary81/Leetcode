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
    public ListNode middleNode(ListNode head) {
        
        ListNode temp = head ;
        ListNode curr = head ;
        int count = 0 ;
        int count1 = 0 ;

        while( temp.next != null ){
            temp = temp.next ;
            count ++ ;
        }

        if( count % 2 == 0 ){
           count1 = ( count / 2 ) + 1 ;

           for( int i = 1 ; i < count1 ; i ++ ){
            curr = curr.next ;
            head = curr ;
           }
        }
        else if( count % 2 != 0 ){
            count1 = (count + 1) / 2 ;

            for( int i = 1 ; i <= count1 ; i ++ ){
                curr = curr.next ;
                head = curr ;
            }
        }
        return head ;
    }
}