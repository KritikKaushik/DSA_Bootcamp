Question 1

Make Power Non-decreasing

AWS provides scalable systems. A set of n servers are used for
horizontally scaling an application. The goal is to have the
computational power of the servers in non-decreasing order. To do so,
you can increase the computational power of each server in any
contiguous segment by x. Choose the values of x such that after the
computational powers are in non-decreasing order, the sum of the x
values is minimum.

Example

There are n = 5 servers and their computational power = [3, 4, 1, 6, 2].

Add 3 units to the subarray (2, 4) and 4 units to the subarray (4, 4).

The final arrangement of the servers is: [3, 4, 4, 9, 9]

The answer is 3 + 4 = 7.

Function Description

Complete the function findMinimumSum in the editor below.

findMinimumSum has the following parameter(s):

int power[n]: the computational powers of n different servers

Returns:

long: the minimum possible sum of integers required to make the array
non-decreasing.

Examples

Example 1

Input: n = 5 power = [3, 4, 1, 6, 2]

Output: 7

Explanation: Add 3 units to the subarray (2, 4) and 4 units to the
subarray (4, 4). The final arrangement of the servers is [3, 4, 4, 9,
9]. The answer is 3 + 4 = 7.

Example 2

Input: n = 3 power = [3, 2, 1]

Output: 2

Explanation: Add 1 unit to the subarray (1, 2) and 1 unit to the
subarray (2, 2). The final arrangement of the servers is [3, 3, 3].

Example 3

Input: n = 4 power = [3, 5, 2, 3]

Output: 3

Explanation: Add 3 units to the subarray (2, 3). The final arrangement
of the servers is [3, 5, 5, 6].

Constraints

1 <= n <= 10^5 1 <= power[i] <= 10^9

Input Format For Custom Testing

The first line contains an integer n, the number of servers.

The following n lines contain the computational power of each server.

Sample Case 0

Sample Input For Custom Testing

3 3 2 1

Sample Output

2

Explanation: Add 1 unit to the subarray (1, 2) and 1 unit to the
subarray (2, 2). The final arrangement of the servers is [3, 3, 3].

