class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        
        // best[i] = minimum length of a target-sum subarray
        // completely within arr[0...i]
        int[] best = new int[n];
        
        int INF = n + 1;
        for (int i = 0; i < n; i++) {
            best[i] = INF;
        }

        int left = 0;
        long sum = 0;
        int minLength = INF;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            // Shrink window if sum becomes too large
            while (sum > target) {
                sum -= arr[left++];
            }

            // We found a subarray with sum = target
            if (sum == target) {
                int currentLength = right - left + 1;

                // Combine with a previous non-overlapping subarray
                if (left > 0 && best[left - 1] != INF) {
                    minLength = Math.min(
                        minLength,
                        currentLength + best[left - 1]
                    );
                }

                // Store the best subarray ending at or before right
                best[right] = currentLength;
            }

            // Carry forward the previous best
            if (right > 0) {
                best[right] = Math.min(best[right], best[right - 1]);
            }
        }

        return minLength == INF ? -1 : minLength;
    }
}
