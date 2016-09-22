import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	Queue<String> q;

	@Before
	public void initQueue() {
		q = new Queue<String>();
	}

	@Test(expected = IllegalStateException.class)
	public void peekOnEmptyQueueThrowsIllegalStateException() {
		q.peek();
	}

	@Test
	public void testenQueueAndPeekOneElement() {
		q = q.enQueue(new String("hello"));
		assertEquals("hello", q.peek());
	}

	@Test
	public void testEnQueueAndPeekTwoElements() {
		q = q.enQueue(new String("cat"));
		q = q.enQueue(new String("dog"));
		assertEquals("cat", q.peek());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testenQueueNullObject() {
		q = q.enQueue(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void enQueueNullValuesThrowsIllegalArgumentException() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(null);
		q = new Queue<String>(list);
	}

	@Test(expected = IllegalStateException.class)
	public void deQueueOnEmptyQueueThrowsIllegalStateException() {
		q.deQueue();
	}

	@Test
	public void testDeQueue() {
		q = q.enQueue(new String("hello"));
		q = q.enQueue(new String("hi"));
		q = q.deQueue();
		assertEquals("hi", q.peek());
	}

	@Test
	public void testisEmptyAfterDequeue() {
		q = q.enQueue(new String("hello"));
		q = q.deQueue();
		assertTrue(q.isEmpty());
	}

	@Test
	public void testisEmpty() {
		assertTrue(q.isEmpty());
	}
}
