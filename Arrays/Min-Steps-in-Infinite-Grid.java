public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i=0;
        int x0,x1,y0,y1;
        x0 = A.get(i);
        y0 = B.get(i);
        int steps=0;
        //System.out.println(A.size());
        //System.out.println(B.size());
        for(i=1;i<A.size();i++){
            x1 = A.get(i);
            y1 = B.get(i);
            //System.out.println(x0+" "+y0+" "+x1+" "+y1);
            //System.out.println(Math.abs(x1-x0)+" "+Math.abs(y1-y0));
            if(Math.abs(x1-x0)<Math.abs(y1-y0)){
                steps += Math.abs(y1-y0);
            }
            else if(Math.abs(x1-x0)>Math.abs(y1-y0)){
                steps += Math.abs(x1-x0);
            }
            else{
                steps += Math.abs(x1-x0);
            }
            x0=x1;
            y0=y1;
        }
        return steps;
    }
}
