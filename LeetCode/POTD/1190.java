class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder curr = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                // Save current string
                stack.push(curr);
                curr = new StringBuilder();

            } else if (ch == ')') {
                // Reverse current substring
                curr.reverse();

                // Get the string before '('
                StringBuilder previous = stack.pop();

                // Append reversed substring
                previous.append(curr);

                curr = previous;

            } else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}
