lass Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
    Map<String,List<String>>map=new HashMap<>();
     for(String str:arr){
         char[]ch=str.toCharArray();
         Arrays.sort(ch);
         String s=String.valueOf(ch);
         if(!map.containsKey(s)){
             map.put(s,new ArrayList());
         }
         map.get(s).add(str);
     }
     return new ArrayList(map.values());
    }
}