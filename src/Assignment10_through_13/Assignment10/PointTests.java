import java.awt.Color;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class PointTests {

	@DataPoints
	public static Point[] points = new Point[] { new Point(1, 3), new Point(1, 3) };

	@DataPoints
	public static ColorPoint[] colorPoints = new ColorPoint[] { new ColorPoint(1, 3, Color.BLACK),
			new ColorPoint(1, 3, Color.BLACK) };

	@Theory
	public void equalsShouldBeSymmetric(Object obj1, Object obj2) {
		assumeThat(obj1.equals(obj2), is(true));
		assertThat(obj2.equals(obj1), is(true));
	}

	@Theory
	public void equalsShouldBeTransitive(Object obj1, Object obj2, Object obj3) {
		assumeThat(obj1.equals(obj2), is(true));
		assumeThat(obj2.equals(obj3), is(true));
		assertThat(obj1.equals(obj3), is(true));
	}

	@Theory
	public void ifEqualsThenHashCodeIsSame(Object obj1, Object obj2) {
		assumeThat(obj1.equals(obj2), is(true));
		assertThat(obj1.hashCode() == obj2.hashCode(), is(true));
	}
}
