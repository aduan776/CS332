import static org.junit.Assert.*;

import org.junit.Test;

public class Point3Tests {

	@Test
	public void testSymmetryP2() {
		Point2 p1 = new Point2(1,4);
		Point2 p2 = new Point2(1,4);
		assertEquals(true, p1.equals(p2));
		assertEquals(true, p2.equals(p1));
		
	}
	
	public void testSymmetryP3() {
		Point3 p1 = new Point3(3,2,5);
		Point3 p2 = new Point3(3,2,5);
		assertEquals(true, p1.equals(p2));
		assertEquals(true, p2.equals(p1));
	}
	
	

}
