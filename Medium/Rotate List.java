/*
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:

Given 1->2->3->4->5->NULL and k = 2,

return 4->5->1->2->3->NULL.

*/

public class Solution {
    //Method to find length of given list
    public int length(ListNode root)
    {
        int len = 0;
        while(root!=null)
        {
            root=root.next;
            len++;
        }
        return len;
    }
    public ListNode rotateRight(ListNode A, int B) {
        
        int size = length(A);
        // taking % for effective rotations 
        B = B%size;
        //from start going to place, where we want to cut the link
        B = size - B;
        
        
        ListNode curr = A;
        ListNode head = null;
        
        //going to end
        while(curr.next!=null) curr = curr.next;
        //making the list as cycle
        curr.next = A;
        
        //travelling to the node where we want to cut the link...
        while(B-->0)
        {
            curr = curr.next;
        }
        
        //assigning new head and breaking the link
        head = curr.next;
        curr.next = null;
        
        return head;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
        
    }
}
