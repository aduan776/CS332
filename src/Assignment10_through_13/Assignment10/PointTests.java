package week9;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class PointTests {

	//I guess theories is just for running this thing with multiple assertions that are true.
	//I get for like mathematical assertions, but idk how they relate to this
	//So I just wrote some basic tests to show this composition works
	
	@Test
	public void symmetryHolds() {
		Point p = new Point(1, 3);
		ColorPoint cp = new ColorPoint(1, 3, Color.BLACK);
		assertEquals(false, p.equals(cp));
		assertEquals(false, cp.equals(p));
	}
	
	@Test
	public void transitivityHolds() {
		Point p = new Point(1, 3);
		ColorPoint cp1 = new ColorPoint(1, 3, Color.BLACK);
		ColorPoint cp2 = new ColorPoint(1, 3, Color.RED);
		assertEquals(false, p.equals(cp1));
		assertEquals(false, cp1.equals(cp2));
	}
}
