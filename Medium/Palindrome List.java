/*
Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.

Notes:

Expected solution is linear in time and constant in space.
For example,

List 1-->2-->1 is a palindrome.
List 1-->2-->3 is not a palindrome.
*/
public class Solution {
    public int lPalin(ListNode A) {
        Stack<Integer> st = new Stack<Integer>();
        
        ListNode temp  = A;
        
        while(temp!=null)
        {
            st.push(temp.val);
            temp = temp.next;
        }
        
        while(A!=null)
        {
            if(st.peek() != A.val) return 0;
            else
            {
                st.pop();
                A = A.next;
            }
        }
        
        return 1;
    }
}
