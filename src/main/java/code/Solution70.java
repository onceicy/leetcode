package code;

public class Solution70 {
    public int climbStairs(int n) {
        int a0 = 0, a1 = 0, a2 = 1;
        for (int i = 1; i <= n; i++) {
            a0 = a1; 
            a1 = a2; 
            a2 = a0 + a1;
        }
        return a2;
    }
}
