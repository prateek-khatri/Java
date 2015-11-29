/*28. Given an array of meeting time intervals consisting of 
 * start and end times [[s1,e1],[s2,e2],...] (si < ei),
 *  find the minimum number of conference rooms required.
For example,
Given [[0, 30],[5, 10],[15, 20]],
return 2.
*/




package com.pack.java;

import java.util.Arrays;


class Solutions{
    public int minMeetingRooms(Interval[] intervals) {
	        int[] starts = new int[intervals.length];
	        int[] ends = new int[intervals.length];
	        for(int i=0; i<intervals.length; i++) {
	            starts[i] = intervals[i].start;
	            ends[i] = intervals[i].end;
	        }
	        Arrays.sort(starts);
	        Arrays.sort(ends);
	        int rooms = 0;
	        int endsItr = 0;
	        for(int i=0; i<starts.length; i++) {
	      //increments the sorted order for comparison between start n end
	        	if(starts[i]<ends[endsItr])
	                rooms++;
	            else
	                endsItr++;
	        }
	        return rooms;
	    }
	}




