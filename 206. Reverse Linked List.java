/*
 *
 Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
 * 
 */


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
        ListNode dummy = null;//lets take a dummy node and assign it to null
        while(head!=null){
            ListNode next = head.next;//take another node which initially points to head->next node
            head.next = dummy; //point head to the dummy to break the previous right arrow node
            dummy = head;//dummy moved to the right (next)
            head = next;//head will be shift to the next
        }
        return dummy;
    }
}