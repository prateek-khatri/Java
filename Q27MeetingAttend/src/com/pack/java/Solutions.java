/*Question 27
Given an array of meeting time intervals consisting of 
start and end times [[s1,e1],[s2,e2],...] (si < ei), 
determine if a person could attend all meetings.
For example,

Given [[0, 30],[5, 10],[15, 20]],
return false.

Solution
The idea is pretty simple: first we sort the intervals in 
the ascending order of start; then we check for the overlapping of 
each pair of neighboring intervals. If they do, then return false;
 after we finish all the checks and have not returned false, just return true.

Sorting takes O(nlogn) time and the overlapping checks take O(n) 
time, so this idea is O(nlogn) time in total*/




package com.pack.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Solutions{
	 boolean canAttendMeetings(Interval[] intervals) {
	    try {
	        Arrays.sort(intervals, new IntervalComparator());
	        //interval comparator checks the condition if true then meetings 
	        //returned else false not in oreder
	    } catch (Exception e) {
	        return false;
	    }
	    return true;
	}

	 class IntervalComparator implements Comparator<Interval> {
	    @Override
	    public int compare(Interval o1, Interval o2) {
	        if (o1.start < o2.start && o1.end <= o2.start)
	            return -1;
	        else if (o1.start > o2.start && o1.start >= o2.end)
	            return 1;
	        throw new RuntimeException();
	    }
	}

}



