/*
Given two integer arrays A and B, and an integer C.
Find the number of integers in A which are greater than C and find the number of integers in B which are less than C.
Return maximum of these two values.


Problem Constraints
1 <= |A|, |B| <= 105
1 <= Ai, Bi, C <=109


Input Format
First argument is an integer array A.
Second argument is an integer array B.
Third argument is an integer C.


Output Format
Return an integer.


Example Input
Input 1:
A = [1, 2, 3, 4]
B = [5, 6, 7, 8]
C = 4
Input 2:

A = [1, 10, 100]
B = [9, 9, 9]
C = 50
*/

public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        int great = 0;
        for(int i : A)if(i>C)great++;
        
        int less = 0;
        for(int i:B)if(i<C)less++;
        
        return Math.max(great, less);
    }
}
