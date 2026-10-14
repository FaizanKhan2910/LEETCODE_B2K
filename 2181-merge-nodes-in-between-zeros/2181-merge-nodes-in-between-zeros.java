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
    public ListNode mergeNodes(ListNode head) {
        ListNode f1 = head.next;
        ListNode f2 = f1;
    
    while(f2 != null){
        int sum = 0;
             while(f2 != null && f2.val != 0)
        {
                sum += f2.val;
                f2 = f2.next;
        }
        f1.val = sum;
        f2 = f2.next;
        f1.next = f2;
        f1 = f1.next;
    }
       return head.next;
    }
}