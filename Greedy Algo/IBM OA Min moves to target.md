A shop in HackerLand contains n items, where the price of the ith item is price[i].
In one operation, the price of any one item can be increased or decreased by 1.
Given q queries denoted by the array query[], find the minimum number of operations required to make the price of all items equal to query[i], for each query.
All queries are independent of each other, i.e., the original prices of the items are restored after each query.
Example:
n = 3
price = [1, 2, 3]
query = [3, 2, 1, 5]
Output:
[3, 2, 3, 9]
Function Description:
Complete the function countMinimumOperations.
Parameters:
int price[n]: the original prices of each item
int query[q]: the queries
Returns:
long_int[q]: the answers to the queries in their order of input
Constraints:
1 ≤ n ≤ 2 × 10^5
1 ≤ price[i] ≤ 10^9
1 ≤ q ≤ 2 × 10^5
1 ≤ query[i] ≤ 10^9
