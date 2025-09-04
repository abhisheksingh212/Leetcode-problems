class Solution {
   public int myAtoi(String s) {
    if (s == null || s.length() == 0) return 0;

    s = s.trim(); 
    if (s.length() == 0) return 0;

    boolean isNegative = false;
    int index = 0;
    if (s.charAt(0) == '-') {
        isNegative = true;
        index++;
    } else if (s.charAt(0) == '+') {
        index++;
    }

    int result = helper(s, index, 0, isNegative);
    return result;
}

private int helper(String s, int index, int result, boolean isNegative) {
    if (index >= s.length() || !Character.isDigit(s.charAt(index))) {
        return isNegative ? -result : result;
    }

    int digit = s.charAt(index) - '0';
    if (result > (Integer.MAX_VALUE - digit) / 10) {
        return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    }

    result = result * 10 + digit;
    return helper(s, index + 1, result, isNegative);
}


}