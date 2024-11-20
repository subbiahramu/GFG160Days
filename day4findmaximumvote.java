
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int a=n/3;
        Arrays.sort(nums);
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++; 
            } else {
                if (count > a) {
                    result.add(nums[i - 1]);
                }
                count = 1; 
            }
        }
        if (count >a) {
            result.add(nums[n - 1]);
        }

        return result;
    }
}