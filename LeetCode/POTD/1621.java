class Solution {
    public int numberOfSets(int n, int k) {
        final long MOD = 1_000_000_007L;

        long[][] dp = new long[k + 1][n];

        // 0 segments: one way for any number of points
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int seg = 1; seg <= k; seg++) {
            long prefix = 0;

            for (int i = 1; i < n; i++) {

                // Add possibilities where the previous segment
                // ends at or before i-1.
                prefix = (prefix + dp[seg - 1][i - 1]) % MOD;

                // Either:
                // 1. Do not use point i as the end of a new segment
                // 2. End a segment at i
                dp[seg][i] = (dp[seg][i - 1] + prefix) % MOD;
            }
        }

        return (int) dp[k][n - 1];
    }
}
