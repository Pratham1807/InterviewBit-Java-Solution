public class Solution {
    private int getMax(ArrayList<Integer> A){
        int max = Integer.MIN_VALUE;
        for(Integer i : A){
            max = Math.max(max, i);
        }
        return max;
    }
    private long getSum(ArrayList<Integer> A){
        int sum = 0;
        for(Integer i : A){
            sum += i;
        }
        return sum;
    }
    
    private int numberOfStudents(ArrayList<Integer> A, int n, long maxPages){
        int students = 1;
        int totalPages = 0;
        for(Integer pages : A){
            totalPages += pages;
            if(totalPages > maxPages){
                students++;
                totalPages = pages;
            }
        }
        return students;
    }
    
    public int books(ArrayList<Integer> A, int B) {
        if(B > A.size()) return -1;
        long lo = getMax(A);
        
        if(B == A.size()){
            return (int)lo;
        }
        
        long hi = getSum(A);
        
        while(lo<hi){
            long mid = lo + (hi-lo)/2;
            // numberOfStudents() -> return the number of students 
            // required if the max number of pages alloted to a student were mid
            int reqStudents = numberOfStudents(A, A.size(), mid);
            if(reqStudents <= B){
                hi = mid;
            }
            else{
                lo = mid + 1;
            }
        }
        
        return (int)lo;
        
    }
}
