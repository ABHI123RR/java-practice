package dp;

public class Fibonacci {

    // Recursive DP with memoization
    public static int fib(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != -1) return memo[n];
        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int[] memo = new int[n + 1];
        for (int i = 0; i <= n; i++) memo[i] = -1;

        System.out.println("Fibonacci of " + n + " is " + fib(n, memo));
    }
}
