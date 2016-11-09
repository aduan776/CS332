package week9;

import java.awt.Color;

public class ColorPoint {
	private final Point p;
	private final Color color;

	public ColorPoint(Point p, Color color) {
		this.p = p;
		this.color = color;
	}

	public ColorPoint(int x, int y, Color color) {
		p = new Point(x, y);
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ColorPoint))
			return false;
		ColorPoint cp = (ColorPoint) obj;
		return color.equals(cp.color) && p.equals(cp.p);
	}
	
	@Override 
	public int hashCode(){
		int result = 19;
		result = 37 * result + p.hashCode();
		result = 37 * result + color.hashCode();
		return result;
	}
}
