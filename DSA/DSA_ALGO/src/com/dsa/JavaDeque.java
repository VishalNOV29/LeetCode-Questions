package com.dsa;

import java.util.ArrayDeque;
import java.util.Deque;

// Implementation of Deque...

public class JavaDeque {
	public static void main(String[] args) {
		System.out.println("Code is running well");

		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		// Adding an element to the queue.
		dq.add(1);
		
		// Adding an element in font of the deque.
		dq.addFirst(10);
		
		// Adding an element in last of the deque.
		dq.addLast(20);
		
		System.out.println(dq);
		
		dq.removeLast();
		
		// poll() this method removes the first element from the dqueq.
//		int last=dq.poll();
		System.out.println(dq);

	}

}
