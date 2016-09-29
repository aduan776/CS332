import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

public class MapPolyTests {

	MapPoly poly;

	public boolean repOk(MapPoly poly) {
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher(poly.toString());
		int i = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (matcher.find()) {
			if (i % 2 != 0)
				list.add(Integer.parseInt(matcher.group()));
			i++;
		}
		Integer[] array = new Integer[list.size()];
		array = list.toArray(array);
		for (int j = 0; j < array.length - 1; j++) {
			if (array[j] > array[j + 1])
				return false;
		}
		return true;
	}

	@Before
	public void createPoly() {
		poly = new MapPoly(23423434, 234234);
		poly = poly.add(new MapPoly(999, 11));
	}
	
	@Test
	public void degreeReliesOnOrder() {
		assertEquals(false, poly.degree() == 234234);
	}

	@Test
	public void addBreaksMonotonicOrder() {
		assertEquals(false, repOk(poly));
	}
	
	@Test
	public void minusBreaksOrKeepsMonotonicOrder(){
	// ran out of time :(
	// if minus breaks order, please prove to me with a test case
	// if minus does not, also prove it to me 
		poly = poly.minus();
		assertEquals(false, repOk(poly));
	}
	
	
	@Test
	public void multiplyBreaksOrKeepsMonotonicOrder(){
	// also ran out of time. One of you guys should do each of this test cases!
		poly = poly.mul(new MapPoly (2, 4));
		assertEquals(false, repOk(poly));
	}
}
