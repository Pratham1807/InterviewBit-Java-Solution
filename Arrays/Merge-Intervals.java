/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int i=0;
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        while(i<intervals.size()){
            if(intervals.get(i).start<=newInterval.start && intervals.get(i).end>=newInterval.start){
                start = intervals.get(i).start;
                break;
            }
            if(intervals.get(i).start>newInterval.start){
                break;
            }
            i++;
        }
        
        while(i<intervals.size()){
            if(intervals.get(i).start<=newInterval.end && intervals.get(i).end>=newInterval.end){
                end = intervals.get(i).end;
                intervals.remove(i);
                break;
            }
            if(newInterval.end < intervals.get(i).start){
                break;
            }
            intervals.remove(i);
        }
        
        
        start = (start<newInterval.start)?start:newInterval.start;
        end = (end>newInterval.end)?end:newInterval.end;
        
        intervals.add(i,new Interval(start,end));

        return intervals;
    }
}
