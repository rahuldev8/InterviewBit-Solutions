/*
You are climbing a stair case and it takes A steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Input Format:

The first and the only argument contains an integer A, the number of steps.
Output Format:

Return an integer, representing the number of ways to reach the top.
Constrains:

1 <= A <= 36
Example :

Input 1:

A = 2 Output 1:

2 Explanation 1:

[1, 1], [2] Input 2:

A = 3 Output 2:

3 Explanation 2: 

[1 1 1], [1 2], [2 1]
*/

public class Solution {
    public int climbStairs(int A) {
        
        if(A<=2)return A;
        
        int[] cache = new int[A+1];
        cache[1] = 1;
        cache[2] = 2;
        
        for(int i=3;i<=A;i++)
            cache[i] = cache[i-1]+cache[i-2];
        return cache[A];    
    }
}
