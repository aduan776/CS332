import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MapPolyTest {
MapPoly betaPoly;
	@Before
	public void createMapPoly(){
		betaPoly = new MapPoly(3, 6);		
	}
	
	@Test
	public void testToString() {
		assertEquals("MapPoly: + 3x^6", betaPoly.toString());
	}

	@Test//(expected = ClassCastException.class)
	public void testDegree(){
		betaPoly = betaPoly.add(new MapPoly(1, 3));
		betaPoly = betaPoly.add(new MapPoly (5, 7));
		betaPoly = betaPoly.add(new MapPoly (2, 5));
		assertEquals(7, betaPoly.degree());
	}
	
	@Test 
	public void testSort(){
		betaPoly = betaPoly.add(new MapPoly(10, 1));
		betaPoly = betaPoly.add(new MapPoly(3, 5));
		betaPoly = betaPoly.add(new MapPoly(3, 5));
		assertEquals("MapPoly: + 10x^1 + 6x^5 + 3x^6", betaPoly.toString());
		
	}
	
	
}
