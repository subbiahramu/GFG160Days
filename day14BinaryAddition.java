public class day14BinaryAddition {

    public static String addBinary(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        // Iterate over both strings from right to left
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            
            // Add bit from s1 if available
            if (i >= 0) {
                sum += s1.charAt(i) - '0';  // Convert char to int (0 or 1)
                i--;
            }
            
            // Add bit from s2 if available
            if (j >= 0) {
                sum += s2.charAt(j) - '0';  // Convert char to int (0 or 1)
                j--;
            }
            
            // Determine the result bit and the new carry
            result.append(sum % 2);  // Current bit (either 0 or 1)
            carry = sum / 2;         // Carry for next position (0 or 1)
        }
        
        // Reverse the result because we added from least significant to most
        return result.reverse().toString();
    }}

