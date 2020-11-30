public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int i=0;
        int n=a.size();
        while(i<(n+1)/2){
            int j=i;
            while(j<n-i-1){
                int temp = a.get(i).get(j);
                a.get(i).set(j,a.get(n-1-j).get(i));
                a.get(n-1-j).set(i,a.get(n-1-i).get(n-1-j));
                a.get(n-1-i).set(n-1-j,a.get(j).get(n-1-i));
                a.get(j).set(n-1-i,temp);
                j++;
            }
            i++;
        }
    }
}
