/*
Given a binary search tree, write a function to find the kth smallest element in the tree.
NOTE: You may assume 1 <= k <= Total number of nodes in BST


Input Format
The first argument is the root node of the binary tree.
The second argument B is an integer equal to the value of k.


Output Format
Return the value of the kth smallest node.


Example Input
  2
 / \
1   3


and k = 2
*/

public class Solution {
    public int kthsmallest(TreeNode A, int B) {
        int count = 0;
        TreeNode curr = A;
        
        while(curr!=null)
        {
            if(curr.left==null)
            {
                count++;
                if(count==B)return curr.val;
                curr = curr.right;
            }
            else
            {
                TreeNode thread = curr.left;
                while(thread.right != null && thread.right != curr)
                    thread = thread.right;
                if(thread.right==null)
                {
                    thread.right = curr;
                    curr = curr.left;
                }
                else
                {
                    thread.right = null;
                    count++;
                    if(count==B)return curr.val;
                    curr = curr.right;
                }    
            }
        }
        return -1;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
