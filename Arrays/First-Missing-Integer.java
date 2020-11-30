public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        boolean[] visited = new boolean[A.size()];
        for(int i =0;i<A.size();i++){
            if(A.get(i)-1<A.size() && A.get(i)>0) visited[A.get(i)-1] = true;
        }
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                return i+1;
            }
        }
        return A.size()+1;
    }
}
