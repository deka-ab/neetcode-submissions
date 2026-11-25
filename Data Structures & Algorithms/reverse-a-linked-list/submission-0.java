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
    public ListNode reverseList(ListNode head) {
        
        ListNode curr = head;
        ListNode prev = null;  
        
        //tom liste 
        if(head == null) {
            return null; 
        }

        while(curr != null){  
            //lagre neste node 
            ListNode temp = curr.next; 
            
            //snu pekeren 
            curr.next = prev; 
            
            //flytte prev 
            prev = curr;

            //flytte curr 
            curr = temp;

        }
        return prev; 
        
    }
}
