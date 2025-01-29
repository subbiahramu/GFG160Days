class Solution {
    double power(double b, int e) {
        // code here
        if(e==0){
            return 1;
        }
        if(e<0) return 1/power(b,-e);
        
        double halfpow=power(b,e/2); 
        
        if(e%2==0){
            return halfpow*halfpow;
        }
        else{
            return b*halfpow*halfpow;
        }
    }
   
}