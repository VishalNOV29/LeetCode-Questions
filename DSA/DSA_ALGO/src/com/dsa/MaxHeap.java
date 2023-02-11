package com.dsa;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

//import java.util.*;

public class MaxHeap {
	public static void main(String args[])
    {
 
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>( Collections.reverseOrder());
 
        // Adding items to our priority queue
        // using add() method
        pQueue.add(10);
        pQueue.add(30);
        pQueue.add(20);
        pQueue.add(400);
 
        // Printing the most priority element
        System.out.println("Head value using peek function:"
                           + pQueue.peek());
 
        // Printing all elements
        System.out.println("The queue elements:");
        Iterator<Integer> itr = pQueue.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
 
        // Removing the top priority element (or head) and
        // printing the modified pQueue using poll()
        pQueue.poll();
        System.out.println("After removing an element " + "with poll function:");
        Iterator<Integer> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next());
 
    }

}
