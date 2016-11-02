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
	
	@Test
	public void testSymmetryP3() {
		Point3 p1 = new Point3(3,2,5);
		Point3 p2 = new Point3(3,2,5);
		assertEquals(true, p1.equals(p2));
		assertEquals(true, p2.equals(p1));
	}
	
	@Test
	public void testTransitivity(){
		Point3 p1 = new Point3(1,4, 6);
		Point2 p2 = new Point2(1,4);
		Point3 p3 = new Point3(1,4,5);

		assertEquals(true, p1.equals(p2));
		assertEquals(true, p2.equals(p3));
		assertEquals(false, p1.equals(p3));	
	}
	
	@Test
	public void testLSP_P2(){
		Point2 p1 = new Point3(1,4, 6);
		Point2 p2 = new Point3(1,4, 6);
		
		assertEquals(true, p1.equals(p2));	
	}

}
