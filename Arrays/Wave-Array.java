public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0;i<A.size();i+=2){
            if(i>0)
                if(A.get(i)<A.get(i-1)){
                    int temp = A.get(i);
                    A.set(i,A.get(i-1));
                    A.set(i-1, temp);
                }
            if(i<A.size()-1)
                if(A.get(i)<A.get(i+1)){
                    int temp = A.get(i);
                    A.set(i, A.get(i+1));
                    A.set(i+1, temp);
                }
        }
        return A;
    }
}
