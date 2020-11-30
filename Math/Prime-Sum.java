public class Solution {
    public boolean[] seiveOfErastosthenese(int A){
        // marking primes as false and non-primes as false for faster execution
        boolean[] arr = new boolean[A+1];
        arr[0] = true;
        arr[1] = true;
        for(int i=0;i*i<=A;i++){
            if(!arr[i]){
                for(int j=2;i*j<=A;j++){
                    arr[i*j]=true;
                }
            }
        }
        return arr;
    }
   
    public ArrayList<Integer> primesum(int A) {
        boolean[] primes = seiveOfErastosthenese(A);
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=2;i<=A/2;i++){
            if(!primes[i]){
                if(!primes[A-i]){
                    res.add(i);
                    res.add(A-i);
                    return res;
                }
            }
        }
        return res;
    }
}
