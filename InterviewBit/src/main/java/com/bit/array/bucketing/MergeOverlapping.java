package com.bit.array.bucketing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MergeOverlapping {

	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		
		if(intervals == null || intervals.isEmpty()) {
			return intervals;
		}
		Collections.sort(intervals, (o1,o2)->o1.start - o2.start);
		Stack<Interval> stack = new Stack<>();
		stack.push(intervals.get(0));
		for(int i=1;i<intervals.size();i++) {
			if(intervals.get(i).start <= stack.peek().end) {
				Interval interval = stack.pop();
				interval.end = Math.max(interval.end, intervals.get(i).end);
				stack.push(interval);
			}else {
				stack.push(intervals.get(i));
			}
		}
		return new ArrayList<>(stack);
	}
	
	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		int index;
		for (index = 0; index < intervals.size();) {
			if (intervals.get(index).start < newInterval.start) {
				index++;
			} else {
				break;
			}
		}
		intervals.add(index, newInterval);
		Stack<Interval> stack = new Stack<>();
		stack.push(intervals.get(0));
		for (int i = 1; i < intervals.size(); i++) {
			if (intervals.get(i).start <= stack.peek().end) {
				Interval interval = stack.pop();
				interval.end = Math.max(interval.end, intervals.get(i).end);
				stack.push(interval);
			} else {
				stack.push(intervals.get(i));
			}
		}
		return new ArrayList<>(stack);
	}

	public static void main(String[] args) {
				
//		ArrayList<Interval> list = new ArrayList<>();
//		list.add(new Interval(1, 3));
//		list.add(new Interval(8, 10));
//		list.add(new Interval(15, 18));
//		list.add(new Interval(2, 6));
//		ArrayList<Interval> result =merge(list);
//		System.out.println(result);
		
		 
		ArrayList<Interval> list = new ArrayList<>();
//		list.add(new Interval(483159, 1169484));
//		list.add(new Interval (1826643, 2460290));
//		list.add(new Interval(3175858, 3194970));
//		list.add(new Interval(6367740, 6623855));
//		list.add(new Interval(8487128, 8818567));
//		list.add(new Interval(9792127, 10916488));
//		list.add(new Interval(11127943, 13462510));
//		list.add(new Interval(13876327, 14292961));
//		list.add(new Interval(16201833, 16234285));
//		list.add(new Interval(17666793, 19711782));
//		list.add(new Interval(20434048, 21393927));
//		list.add(new Interval(21957286, 24047424));
//		list.add(new Interval(27078991, 27509927));
//		list.add(new Interval(28074197, 28433809));
//		list.add(new Interval(29692677, 29716094));
//		list.add(new Interval(32279599, 35063176));
//		list.add(new Interval(35112777, 35202667));
//		list.add(new Interval(35818785, 36156692));
//		list.add(new Interval(36885047, 43342457));
//		list.add(new Interval(44760178, 46139191));
//		list.add(new Interval(46927299, 47205387));
//		list.add(new Interval(47407870, 47762260));
//		list.add(new Interval(48221607, 49228277));
//		list.add(new Interval(49395719, 49418628));
//		list.add(new Interval(50697408, 50717245));
//		list.add(new Interval(52655226, 53027560));
//		list.add(new Interval(53661951, 55052977));
//		list.add(new Interval(57173419, 58236522));
//		list.add(new Interval(60018711, 62709818));
//		list.add(new Interval(64477424, 64892264));// (65398875, 65401582), (65677348, 65918630), (65976212, 67587496), (67644144, 67769207), (68408789, 68568347), (69841677, 71971239), (72709714, 73212124), (74059238, 75090824), (75280384, 79602220), (79961841, 81338346), (81376065, 82238505), (82445793, 82801581), (83138615, 83194151), (86207044, 87485526), (90353612, 90782202), (91882041, 92118202), (92360398, 93022414), (93734201, 93839245), (95176412, 95324790), (95616841, 96411200), (96594977, 97205339) ]
		
		list.add(new Interval(3, 5));
		list.add(new Interval(8, 10));
		Interval newInterval = new Interval(4, 6);
		ArrayList<Interval> result =insert(list,newInterval);
		System.out.println(result);
	}

}

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
    
}
