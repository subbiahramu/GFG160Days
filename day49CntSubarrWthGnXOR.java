class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        Map<Integer,Integer>map=new HashMap<>();
        int currXor=0,ans=0;
        map.put(0,1);
        for(int i:arr){
            currXor^=i;
            if(map.containsKey(currXor^k)){
                ans+=map.get(currXor^k);
            }
            map.put(currXor,map.getOrDefault(currXor,0)+1);
        }
        return ans;
    }
}