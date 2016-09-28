import static org.junit.Assert.*;

import org.junit.Test;


public class MapPolyTest {

	@Test
	public void testToString() {
		MapPoly poly = new MapPoly(2, 4);
		assertEquals("MapPoly: + 2x^4", poly.toString());
	}

}
