class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
    ArrayList<Integer> s=new ArrayList<>();
        int pat_len=pat.length();
        int txt_len=txt.length();
        for(int i=0; i <= txt_len-pat_len; i++){
            if(txt.substring(i,i+pat_len).equals(pat)){
                s.add(i);
            }
        }
        return s;
    }
}