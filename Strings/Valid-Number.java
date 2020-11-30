public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isNumber(final String A) {
        int right = A.length()-1;
        int left = 0;
        
        while(left<A.length() && A.charAt(left) == ' '){
            left++;
        }
        while(right>=0 && A.charAt(right) == ' '){
            right--;
        }
        
        if(left > right) return 0;
        
        String a = A.substring(left, right+1);
        
        int e_pos = -1;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == 'e'){
                e_pos = i;
                break;
            }
        }
            
        if(e_pos == -1){
            return isDecimal(a,0,a.length()) ? 1 : 0;
        }
        
        if(a.charAt(e_pos+1) == '+' || a.charAt(e_pos+1) == '-'){
            return isDecimal(a,0,e_pos) && isInt(a,e_pos+2,a.length()) ? 1 : 0;
        }
        
        return isDecimal(a,0,e_pos) && isInt(a,e_pos+1,a.length()) ? 1 : 0;
    }
    
    public boolean isDecimal(String a, int start, int end){
        if(start == end){
            return false;
        }
        if(a.charAt(start) == '+' || a.charAt(start) == '-'){
            start++;
        }
        int decimal_pos = -1;
        for(int i=0;i<end;i++){
            if(a.charAt(i) == '.'){
                decimal_pos = i;
                break;
            }
        }
        
        if(decimal_pos == -1){
            return isInt(a,0,end);
        }
        
        if(decimal_pos == 0){
            return isInt(a,decimal_pos+1,end);
        }
        
        return isInt(a,start,decimal_pos) && isInt(a,decimal_pos+1,end);
    }
    
    public boolean isInt(String a, int start, int end){
        if(start == end){
            return false;
        }
        for(int i=start;i<end;i++){
            if( !(48 <= a.charAt(i) && a.charAt(i) <= 57) ){
                return false;
            }
        }
        return true;
    }
}
