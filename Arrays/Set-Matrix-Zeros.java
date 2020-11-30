public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int n=a.size(), m=a.get(0).size();
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a.get(i).get(j) == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] || col[j]){
                    a.get(i).set(j,0);
                }
            }
        }
    }
}
