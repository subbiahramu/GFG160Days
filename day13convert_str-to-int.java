class Solution {
    public int myAtoi(String s) {
        
          int index = 0, sign = 1, result = 0;
        int n = s.length();
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }
        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }
        while (index < n && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            int digit = s.charAt(index) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }
    }