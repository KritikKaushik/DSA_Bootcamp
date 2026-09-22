class Solution {
    static class Node {
        int[] remainCount;
        int prod;

        Node(int k) {
            this.remainCount = new int[k];
            this.prod = 1;
        }
    }

    private int k;
    private Node[] tree;
    private int n;

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.k = k;
        this.n = nums.length;
        this.tree = new Node[4 * n];

        build(nums, 1, 0, n - 1);

        int[] result = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int idx = queries[q][0];
            int val = queries[q][1];
            int start = queries[q][2];
            int targetX = queries[q][3];

            // 1. Update element
            update(1, 0, n - 1, idx, val);

            // 2. Query range [start, n - 1]
            Node resNode = query(1, 0, n - 1, start, n - 1);

            // 3. Store result for target remainder x
            result[q] = resNode.remainCount[targetX];
        }

        return result;
    }

    private void build(int[] nums, int node, int start, int end) {
        tree[node] = new Node(k);
        if (start == end) {
            int rem = nums[start] % k;
            tree[node].prod = rem;
            tree[node].remainCount[rem] = 1;
            return;
        }

        int mid = start + (end - start) / 2;
        build(nums, 2 * node, start, mid);
        build(nums, 2 * node + 1, mid + 1, end);

        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    private void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            int rem = val % k;
            tree[node] = new Node(k);
            tree[node].prod = rem;
            tree[node].remainCount[rem] = 1;
            return;
        }

        int mid = start + (end - start) / 2;
        if (idx <= mid) {
            update(2 * node, start, mid, idx, val);
        } else {
            update(2 * node + 1, mid + 1, end, idx, val);
        }

        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    private Node query(int node, int start, int end, int ql, int qr) {
        if (ql <= start && end <= qr) {
            return tree[node];
        }

        int mid = start + (end - start) / 2;
        if (qr <= mid) {
            return query(2 * node, start, mid, ql, qr);
        }
        if (ql > mid) {
            return query(2 * node + 1, mid + 1, end, ql, qr);
        }

        Node leftChild = query(2 * node, start, mid, ql, qr);
        Node rightChild = query(2 * node + 1, mid + 1, end, ql, qr);

        return merge(leftChild, rightChild);
    }

    private Node merge(Node left, Node right) {
        Node parent = new Node(k);
        parent.prod = (left.prod * right.prod) % k;

        // Copy prefix counts from left child
        for (int i = 0; i < k; i++) {
            parent.remainCount[i] += left.remainCount[i];
        }

        // Add prefix counts extended through right child
        for (int i = 0; i < k; i++) {
            if (right.remainCount[i] > 0) {
                int newRem = (left.prod * i) % k;
                parent.remainCount[newRem] += right.remainCount[i];
            }
        }

        return parent;
    }
}
