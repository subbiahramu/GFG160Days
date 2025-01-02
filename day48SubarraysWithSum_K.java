class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int currsum=0;
        int ans=0;
        for(int i:arr){
            currsum+=i;
            if(map.containsKey(currsum-k)){
                ans+=map.get(currsum-k);
            }
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
    return ans;
    }
}