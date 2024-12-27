import java.util.HashMap;

public class PairSum {
    public static int countPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            // Check if the complement exists in the map
            int complement = target - num;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            
            // Add the current number to the map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }}

 