/**
  * Generic Queue example
  * Mutable Version, without specifications
  * SWE/CS 332
  * @author Paul Ammann
  */

/**
 * Pyoung Kang Kim reviewed code and added needed Exceptions in code, specifications and wrote some test cases.
 * Daniel Quintero also reviewed over code and added a good portion of the test cases.
 * Alex Duan wrote many of the methods including the constructors and the mutator/observer methods.
 */

import java.util.*;

public class Queue<E> {
	// OVERVIEW: Queues are immutable Queues with generic elements
	private List<E> elements;
	private int size;

	// constructor
	public Queue() {
		// EFFECTS: Initializes this to be the empty Queue
		this.elements = new ArrayList<E>();
		this.size = 0;
	}

	// constructor
	/*
	 * Precondition: 
	 * Postcondition: if ArrayList<E> elements has null value(s)throw IllegalArgumentException 
	 * else new Queue is created with Arraylist<E> elements
	 * 
	 */
	public Queue(ArrayList<E> elements) {
		// EFFECTS: Initializes this to be a Queue with elements from ArrayList
		for (E element : elements)
			if (element == null)
				throw new IllegalArgumentException("Queue(ArrayList<E> elements) constructor");
		
		this.elements = elements;
		this.size = elements.size();
	}

	// producer
	public Queue<E> enQueue(E e) {
		// EFFECTS: If e is null throw IllegalArgumentException
		// else returns a new Queue with the previous elements + e
		if (e == null)
			throw new IllegalArgumentException("Queue.enQueue");

		ArrayList<E> al = new ArrayList<E>();
		for (E item : elements)
			al.add(item);
		al.add(e);
		return new Queue<E>(al);
	}

	// producer
	public Queue<E> deQueue() {
		// EFFECTS: If Queue is empty, throw IllegalStateException
		// else returns a new Queue with the index elements shifted i-1
		if (isEmpty())
			throw new IllegalStateException("Queue.deQueue");
		
		Queue<E> tmp = new Queue<E>();
		for (int i = 1; i < this.size; i++)
			tmp = tmp.enQueue(this.elements.get(i));
		return tmp;
	}

	// observer
	public E peek() throws IllegalStateException {
		// EFFECTS: If Queue is empty throw IllegalStateException
		// else return the first element
		if (isEmpty())
			throw new IllegalStateException("Queue.peek");
		return this.elements.get(0);
	}

	// observer
	public boolean isEmpty() {
		// EFFECTS: returns true if size == 0
		return this.size == 0;
	}

	public static void main(String[] args) {
		// Simple exercise to enQueue/deQueue cmd line args
		// Usage: java Queue item1 item2 item3 ...
		Queue<String> q = new Queue<String>();
		for (String arg : args)
			q.enQueue(arg);
		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q = q.deQueue();
		}
	}
}
