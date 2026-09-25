import java.util.*;

class Solution {

    String s;
    int index;

    public List<String> braceExpansionII(String expression) {
        s = expression;
        index = 0;

        Set<String> result = parseExpression();

        List<String> ans = new ArrayList<>(result);
        Collections.sort(ans);

        return ans;
    }

    // expression = term (',' term)*
    private Set<String> parseExpression() {

        Set<String> result = parseTerm();

        while (index < s.length() && s.charAt(index) == ',') {
            index++; // skip ','

            Set<String> next = parseTerm();
            result.addAll(next); // UNION
        }

        return result;
    }

    // term = factor factor factor...
    private Set<String> parseTerm() {

        Set<String> result = new HashSet<>();
        result.add("");

        while (index < s.length()
                && s.charAt(index) != '}'
                && s.charAt(index) != ',') {

            Set<String> next = parseFactor();

            // Cartesian product = CONCATENATION
            Set<String> temp = new HashSet<>();

            for (String a : result) {
                for (String b : next) {
                    temp.add(a + b);
                }
            }

            result = temp;
        }

        return result;
    }

    // factor = letter OR {expression}
    private Set<String> parseFactor() {

        Set<String> result = new HashSet<>();

        if (s.charAt(index) == '{') {

            index++; // skip '{'

            result = parseExpression();

            index++; // skip '}'

        } else {

            result.add(String.valueOf(s.charAt(index)));
            index++;
        }

        return result;
    }
}
