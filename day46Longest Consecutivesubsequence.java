class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        
    Arrays.sort(arr);
      int currstreak=1;
      int longstreak=1;
    
      for(int i=1;i<arr.length;i++){
          if(arr[i]==arr[i-1]){
              continue;
          }
          if(arr[i]==arr[i-1]+1){
              currstreak++;
          }
          else{
              longstreak=Math.max(longstreak,currstreak);
              currstreak=1;
          }
      }
      return Math.max(longstreak,currstreak);
   
    }
}