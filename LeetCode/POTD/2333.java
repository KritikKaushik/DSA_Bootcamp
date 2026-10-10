
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2,
                                 int k1, int k2) {

        int n = nums1.length;
        int[] diff = new int[n];

        long k = (long) k1 + k2;
        int max = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
            total += diff[i];
        }

        // All differences can become zero
        if (k >= total) {
            return 0;
        }

        // Find the minimum achievable maximum difference
        int low = 0, high = max;

        while (low < high) {
            int mid = low + (high - low) / 2;
            long needed = 0;

            for (int d : diff) {
                if (d > mid) {
                    needed += d - mid;
                }
            }

            if (needed <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int limit = low;
        long used = 0;
        long ans = 0;
        long count = 0;

        for (int d : diff) {
            if (d > limit) {
                used += d - limit;
                ans += (long) limit * limit;
            } else {
                ans += (long) d * d;
            }

            if (d >= limit) {
                count++;
            }
        }

        // Use remaining operations to reduce limit to limit - 1
        long remaining = k - used;

        ans -= remaining * (2L * limit - 1);

        return ans;
    }
}
