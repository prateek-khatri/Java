/*28. Given an array of meeting time intervals consisting of 
 * start and end times [[s1,e1],[s2,e2],...] (si < ei),
 *  find the minimum number of conference rooms required.
For example,
Given [[0, 30],[5, 10],[15, 20]],
return 2.
*/
package com.pack.java;



public class Meetingattend {


	
public static void main(String[] args) {
	
Interval i1 = new Interval(0,30);
Interval i2 = new Interval(5,10);
Interval i3 = new Interval(15,20);
Interval i[]={i1,i2,i3} ;
Solutions sol= new Solutions();
System.out.println(sol.minMeetingRooms(i));

}
    }
	
