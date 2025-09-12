class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        if (num == null || num.length() == 0) return result;
        backtrack(result, num, target, "", 0, 0, 0);
        return result;
    }
    
    private void backtrack(List<String> result, String num, int target, String expr, int pos, long value, long prev) {
        // Base case: if all digits are used, check if the value equals target
        if (pos == num.length()) {
            if (value == target) {
                result.add(expr);
            }
            return;
        }
        
        // Try all possible numbers starting from pos
        for (int i = pos; i < num.length(); i++) {
            // Handle leading zero
            if (i != pos && num.charAt(pos) == '0') break;
            
            // Extract current number as a string
            String currStr = num.substring(pos, i + 1);
            long currNum = Long.parseLong(currStr);
            
            // If this is the first number (no operator before it)
            if (pos == 0) {
                backtrack(result, num, target, currStr, i + 1, currNum, currNum);
            } else {
                // Try addition
                backtrack(result, num, target, expr + "+" + currStr, i + 1, value + currNum, currNum);
                
                // Try subtraction
                backtrack(result, num, target, expr + "-" + currStr, i + 1, value - currNum, -currNum);
                
                // Try multiplication
                // For multiplication, we need to revert the previous operation and apply multiplication
                backtrack(result, num, target, expr + "*" + currStr, i + 1, 
                         value - prev + prev * currNum, prev * currNum);
            }
        }
    }
    
}