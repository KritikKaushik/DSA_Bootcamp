import java.util.*;

class Solution {

    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();

        // Find minimum number of '(' and ')' to remove
        int leftRemove = 0;
        int rightRemove = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftRemove++;
            } 
            else if (c == ')') {
                if (leftRemove > 0) {
                    leftRemove--;
                } else {
                    rightRemove++;
                }
            }
        }

        dfs(s, 0, leftRemove, rightRemove, result);

        return result;
    }

    private void dfs(String s, int index,
                     int leftRemove, int rightRemove,
                     List<String> result) {

        // No removals left -> check if valid
        if (leftRemove == 0 && rightRemove == 0) {
            if (isValid(s)) {
                result.add(s);
            }
            return;
        }

        for (int i = index; i < s.length(); i++) {

            // Avoid generating duplicate strings
            if (i > index && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }

            char c = s.charAt(i);

            // Remove '('
            if (c == '(' && leftRemove > 0) {
                dfs(
                    s.substring(0, i) + s.substring(i + 1),
                    i,
                    leftRemove - 1,
                    rightRemove,
                    result
                );
            }

            // Remove ')'
            if (c == ')' && rightRemove > 0) {
                dfs(
                    s.substring(0, i) + s.substring(i + 1),
                    i,
                    leftRemove,
                    rightRemove - 1,
                    result
                );
            }
        }
    }

    private boolean isValid(String s) {
        int balance = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                balance++;
            } 
            else if (c == ')') {
                balance--;

                if (balance < 0) {
                    return false;
                }
            }
        }

        return balance == 0;
    }
}
