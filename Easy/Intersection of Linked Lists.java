/*
Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:


A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗
B:     b1 → b2 → b3

begin to intersect at node c1.

Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.

*/

public class Solution {
    public int length(ListNode root)
    {
        int len = 0;
        while(root!=null)
        {
            len++;
            root = root.next;
        }
        return len;
    }
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
        int Asize = length(a);
        int Bsize = length(b);
        
        while(Asize<Bsize)
        {
            Bsize--;
            b = b.next;
        }
        while(Asize>Bsize)
        {
            Asize--;
            a = a.next;
        }
        
        while(a!=b)
        {
            a = a.next;
            b = b.next;
        }
        
        return a;
	}
}
