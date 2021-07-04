package com.aseef.jcfp;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());

	}

}

// Points From https://www.programiz.com/java-programming/queue

// Methods of Queue

// 	The Queue interface includes all the methods of the Collection interface. It is because Collection is the super interface of Queue.

// 	Some of the commonly used methods of the Queue interface are:

// 	=>  add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
// 	=>  offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
// 	=>  element() - Returns the head of the queue. Throws an exception if the queue is empty.
// 	=>  peek() - Returns the head of the queue. Returns null if the queue is empty.
// 	=>  remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
// 	=>  poll() - Returns and removes the head of the queue. Returns null if the queue is empty.

