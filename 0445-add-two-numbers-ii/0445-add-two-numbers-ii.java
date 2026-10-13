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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode l3 = new ListNode(0);
        ListNode  ans = l3;

        int carry = 0;
       
        while(l1 != null || l2 != null || carry > 0)
        {
             int a = 0;
            int b = 0;
            if( l1 != null){
                a = l1.val;
                l1 = l1.next;
            }
             if( l2 != null){
                b = l2.val;
                l2 = l2.next;
            }
            int sum = a + b + carry;

        int digit = sum % 10;
            carry = sum / 10;

            ans.next = new ListNode(digit);
            
           ans = ans.next;

      
        }
              if(carry > 0)
        {
            ans.next = new ListNode(carry);
        }

      

        return reverse(l3.next);
        
    }

         
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
          ListNode curr = head;
          if(head == null || head.next == null)

          {
            return head;
          }

          while(curr != null)
          {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
          }

          return prev;
    }
}