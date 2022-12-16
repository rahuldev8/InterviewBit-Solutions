/*
Given a singly linked list

    L: L0 → L1 → … → Ln-1 → Ln,
reorder it to:

    L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
You must do this in-place without altering the nodes’ values.

For example,

Given {1,2,3,4}, reorder it to {1,4,2,3}.

*/

public class Solution {
    public ListNode reverse(ListNode root)
    {
        ListNode prev = null;
        ListNode curr = root;
        ListNode next = null;
        
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    public ListNode reorderList(ListNode A) {
        //Step 1: find middle of given list
        ListNode slow = A;
        ListNode fast = A;
        
        while(fast!=null)
        {
            fast = fast.next;
            if(fast!=null)
            {
                fast = fast.next;
                slow = slow.next;
            }
        }
        
        ListNode ans = A;
        //Step 2: creating two list and reversing the second list
        ListNode first = A;
        ListNode second = reverse(slow.next);
        slow.next = null;
        
        //Step 3: binding two lists
        while(second!=null)
        {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            
            first.next = second;
            second.next = temp1;
            
            first = temp1;
            second = temp2;
        }
        
        return ans;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
        
    }
}
