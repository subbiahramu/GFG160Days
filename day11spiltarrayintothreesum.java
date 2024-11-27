class Solution {

    public List<Integer> findSplit(int[] arr) {
         int totalSum = 0;
        for (int num : arr)
           totalSum += num;
        if (totalSum % 3 != 0) {
            return Arrays.asList(-1, -1);
        }

        int target = totalSum / 3;
        int sum = 0, count = 0;
        int i = -1, j = -1;

        for (int k = 0; k < arr.length; k++) {
            sum += arr[k];
            if (sum == target) {
                count++;
                sum = 0;

                if (count == 1) 
                    i = k; 
                if (count == 2) {      
                    j = k;
                    break;
                }
            }
        }
        return (count == 2 && j < arr.length - 1) 
            ? Arrays.asList(i, j)  
            : Arrays.asList(-1, -1); 
    }
    }