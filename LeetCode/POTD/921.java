class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int additions = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;       // matches an existing '('
                } else {
                    additions++;  // need to insert '('
                }
            }
        }

        // Remaining '(' need a ')' for each
        return additions + open;
    }
}
