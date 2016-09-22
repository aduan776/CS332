import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	Queue q;
	
	@Before
	public void initQueue(){
		q= new Queue();
	}
	
	@Test
	public void testenQueueAndPeek(){
		q = q.enQueue(new String("hello"));
		assertEquals("hello", q.peek());
	}
	
	@Test
	public void testenQueueNullObject(){
		q = q.enQueue(null);
		assertEquals(null, q.peek());
	}
	
	@Test
	public void testDeQueue(){
		q = q.enQueue(new String("hello"));
		q = q.enQueue(new String("hi"));
		q = q.deQueue();
		assertEquals("hi", q.peek());
	}
	
	@Test
	public void testisEmpty(){
		assertTrue(q.isEmpty());
	}
}
