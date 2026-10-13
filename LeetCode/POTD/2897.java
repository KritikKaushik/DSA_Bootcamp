class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int mod = 1000000007;
        int[] bit = new int[31];

        for (int n : nums) {
            for (int i = 0; i < 31; i++) {
                if ((n & (1 << i)) != 0) {
                    bit[i]++;
                }
            }
        }

        long ans = 0;

        for (int i = 0; i < k; i++) {
            long num = 0;

            for (int j = 0; j < 31; j++) {
                if (bit[j] > 0) {
                    num |= (1L << j);
                    bit[j]--;
                }
            }

            ans = (ans + num * num) % mod;
        }

        return (int) ans;
    }
}
