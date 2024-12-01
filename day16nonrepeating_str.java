class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        char []ch=s.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        for(int i=0;i<ch.length;i++){
            if(map.get(ch[i])==1){
                return ch[i];
            }
        }
        return '$';
    }
}