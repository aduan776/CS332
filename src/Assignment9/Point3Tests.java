import static org.junit.Assert.*;

import org.junit.Test;

public class Point3Tests {

	@Test
	public void testSymmetry() {
		Point2 p = new Point2(1, 3);
		Point2 q = new Point3(1, 3, 3);
		assertEquals(true, p.equals(q));
		assertEquals(true, q.equals(p));
	}

	@Test
	public void testSymmetryP2() {
		Point2 p1 = new Point2(1, 4);
		Point2 p2 = new Point2(1, 4);
		assertEquals(true, p1.equals(p2));
		assertEquals(true, p2.equals(p1));

	}

	@Test
	public void testSymmetryP3() {
		Point3 p1 = new Point3(3, 2, 5);
		Point3 p2 = new Point3(3, 2, 5);
		assertEquals(true, p1.equals(p2));
		assertEquals(true, p2.equals(p1));
	}

	@Test
	public void testTransitivity() {
		Point3 p1 = new Point3(1, 4, 6);
		Point2 p2 = new Point2(1, 4);
		Point3 p3 = new Point3(1, 4, 5);
		assertEquals(true, p1.equals(p2));
		assertEquals(true, p2.equals(p3));
		assertEquals(false, p1.equals(p3));
	}
	
	@Test
	public void testLSPPropertiesRuleCompiles() {
		// No invariants are violated
		// General Object Behavior is very limited to just equals and they work correctly
	}

	@Test
	public void testLSPMethoodsRule() {
		// precondition : true
		// post : both equals method calls super.equals, and on top of that
		// only strengthens it by making more promises(when the argument was Point3, it returns
		// the extra equals for Point3, which ALSO calls the super.equals)
	}

	@Test
	public void testLSPSigniatureRuleCompiles() {
		// Guaranteed by compiler, put @Override to the intended overridden methods 
	}
}
