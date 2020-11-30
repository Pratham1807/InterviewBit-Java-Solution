public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    
    class Node implements Comparable<Node>{
        String number;
        Node(int x){
            number = Integer.toString(x);
        }
        @Override
        public int compareTo(Node obj){
            String XY= this.number + obj.number;
            String YX= obj.number + this.number; 
            return XY.compareTo(YX) > 0 ? -1:1; 
        }
    }
    
    
    public String largestNumber(final List<Integer> A) {
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(Integer i : A){
            arr.add(Integer.toString(i));
        }
        
        
        Collections.sort(arr, new Comparator<String>(){ 
            @Override
            public int compare(String X, String Y) { 
            String XY=X + Y; 
            String YX=Y + X; 
            
            return XY.compareTo(YX) > 0 ? -1:1; 
        } 
        }); 
          
        StringBuilder res = new StringBuilder();      
        Iterator it = arr.iterator(); 
      
        while(it.hasNext()) {
            res.append(it.next()); 
        } 
        
        if(res.charAt(0) == '0') return "0";
        
        return res.toString();
    }
}
