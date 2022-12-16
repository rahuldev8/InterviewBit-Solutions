/*
Problem Description
 
 

Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed. Negative numbers are not palindromic.



Problem Constraints
INT_MIN <= A <= INT_MAX


Input Format
The first argument is an integer A.


Output Format
Return 1 if A is a Palindrome Integer else return 0.


Example Input
Input 1:
A = 12121
Input 2:
A = 123


Example Output
Output 1:
1
Output 2:
0
*/
public class Solution {
    public int isPalindrome(int A) {
        if(A<0)return 0;
        
        int rev = 0;
        int ans = A;
        
        while(ans != 0)
        {
            rev *= 10;
            int temp = ans%10;
            rev += temp;
            ans /= 10;
        }
        
        return A==rev?1:0;
    }
}
