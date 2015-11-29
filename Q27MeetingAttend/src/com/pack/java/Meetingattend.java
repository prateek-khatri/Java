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

import java.util.ArrayList;


public class Meetingattend {


	
public static void main(String[] args) {
	
Interval i1 = new Interval(0,30);
Interval i2 = new Interval(5,10);
Interval i3 = new Interval(15,20);
Interval i[]={i1,i2,i3} ;
Solutions sol= new Solutions();
System.out.println(sol.canAttendMeetings(i));

}
    }
	
