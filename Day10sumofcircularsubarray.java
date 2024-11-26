class Solution {
    public int circularSubarraySum(int arr[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currentMax = 0, currentMin = 0;
        
        for (int i : arr) {
            sum += i;
            currentMax = Math.max(i, currentMax + i);
            maxSum = Math.max(maxSum, currentMax);
     
            currentMin = Math.min(i, currentMin + i);
            minSum = Math.min(minSum, currentMin);
        }
        if (sum == minSum) {
            return maxSum;
        }
        return Math.max(maxSum, sum - minSum);
    }
}
