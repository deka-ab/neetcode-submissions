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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode start = new ListNode(0); //tom liste/startpeker 
        ListNode tail = start;  

        //vi holder på så lenge listene ikke er tomme - sliter med      betingelsen - holder det med en kanskje? vil ikke lage en ny datastruktur for å holde på listene 
        
        while(list1 != null && list2 != null){
            
            if(list1.val <= list2.val){
                tail.next = list1; 
                //gå videre i list1
                list1 = list1.next;
            }else{
                tail.next = list2; 
                //gå videre i list2
                list2 = list2.next; 
            }

            //flytter den til noden vi koblet til nå 
            tail = tail.next; 
        }

        //koble på resten 
        if(list1 != null){
            tail.next = list1; 

        }else{
            tail.next = list2;
        }

        return start.next; 
        
    }
}