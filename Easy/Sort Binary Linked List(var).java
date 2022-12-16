/*
Given a Linked List A consisting of N nodes.

The Linked List is binary i.e data values in the linked list nodes consist of only 0's and 1's.

You need to sort the linked list and return the new linked list.

NOTE:

Try to do it in constant space.
*/

public class Solution {
    public ListNode solve(ListNode A) {
        int zeros = 0;
        ListNode curr = A;
        
        while(curr!=null)
        {
            if(curr.val == 0)zeros++;
            curr = curr.next;
        }
        
        curr = A;
        
        //Forcing the first, zeros elements to be 0
        while(zeros-->0)
        {
            curr.val = 0;
            curr = curr.next;
        }
        //others as 1
        while(curr!=null)
        {
            curr.val = 1;
            curr = curr.next;
        }
        
        return A;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
