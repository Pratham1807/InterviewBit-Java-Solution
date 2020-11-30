public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry = 1;
        for(int i=A.size()-1;i>=0;i--){
            if(carry==1){
                if(A.get(i) == 9){
                    A.set(i,0);
                    carry=1;
                }
                else{
                    A.set(i,A.get(i)+carry);
                    carry=0;
                }
            }
        }
        if(carry==1){
            A.add(0,1);
        }
        
        while(A.get(0)==0){
            A.remove(0);
        }
        return A;
    }
}
