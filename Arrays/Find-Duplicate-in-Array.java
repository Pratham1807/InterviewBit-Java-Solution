public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
        int[] res = new int[A.size()];
        for(Integer i : A){
            if(res[i] > 0){
                return i;
            }
            res[i]++;
        }
        return -1;
    }
}
