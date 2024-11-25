class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
      if (arr == null || arr.length == 0) {
            return 0;
        }

        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE; 
        int start = 1; 
        int end= 1; 
    for (int i = 0; i < n; i++) {
     start = (start == 0) ? arr[i] : start* arr[i];
     end= (end == 0) ? arr[n - 1 - i] : end* arr[n - 1 - i];
        maxProduct = Math.max(maxProduct, Math.max(start, end));
        }

        return maxProduct;
    
    }
}