public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        // Kadane's Algorithm
        int max = A.get(0);
        int sum = A.get(0);
        for(int i=1;i<A.size();i++){
            sum = Math.max(A.get(i),A.get(i)+sum);
            if(max<sum) max = sum;
        }
        return max;
    }
}
