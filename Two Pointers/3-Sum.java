public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        int i,j,k;
        int n = A.size();
        long res = Integer.MAX_VALUE;
        long minDiff = Integer.MAX_VALUE;
        
        Collections.sort(A);
        
        for(i=0;i<n-2;i++){
            if(i>0) while(A.get(i)-A.get(i-1)==0 && i<n-2) i++;
            j=i+1;
            k=n-1;
            while(j<k){
                long tripletSum = A.get(i)+A.get(j)+A.get(k);
                long diff = (tripletSum-B);
                //System.out.println(i+" "+j+" "+k+" "+diff);
                //System.out.println(A.get(i)+" "+A.get(j)+" "+A.get(k));
                
                if(minDiff > Math.abs(diff)){
                    minDiff = Math.abs(diff);
                    res = tripletSum;
                }
                if(diff > 0){
                    k--;
                }
                else if (diff < 0){
                    j++;
                }
                else{
                    return (int)tripletSum;
                }
            }
        }
        return (int)res;
    }
}
