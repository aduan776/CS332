import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;


public class FilterIteratorTest {

	Iterator<Integer> filterIterator;

	@Before
	public void setUpFilterIterator() {
		ArrayList<Integer> funList = new ArrayList<Integer>();
		funList.addAll(Arrays.asList(3, 2, 0, 3, 1, 2));
		Iterator<Integer> funListIterator = funList.iterator();
		Check<Integer> checker = new Check<Integer>();
		filterIterator = FilterIterator.filter(funListIterator, checker);
	}

	@Test
	public void testNextReturnsNextEvenElement() {
		assertEquals(new Integer(2), filterIterator.next());
		assertEquals(new Integer(0), filterIterator.next());
		assertEquals(new Integer(2), filterIterator.next());
	}

	@Test
	public void testHasNextIsTrueBeforeThreeNexts() {
		assertEquals(true, filterIterator.hasNext());
		filterIterator.next();
		assertEquals(true, filterIterator.hasNext());
		filterIterator.next();
		assertEquals(true, filterIterator.hasNext());
		filterIterator.next();
		assertEquals(false, filterIterator.hasNext());
	}

	@Test
	public void testHasNextIsFalseAfterThreeNexts() {
		filterIterator.next();
		filterIterator.next();
		filterIterator.next();
		assertEquals(false, filterIterator.hasNext());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testNoSuchElementExceptionAfterThreeNexts(){
		filterIterator.next();
		filterIterator.next();
		filterIterator.next();
		filterIterator.next();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testRemoveThrowsUnsupportedOperationException() {
		filterIterator.remove();
	}

	@Test(expected = NullPointerException.class)
	public void testEmptyIteratorArgumentThrowsNullPointerException() {
		filterIterator = FilterIterator.filter(null, new Check<Integer>());
	}

}
