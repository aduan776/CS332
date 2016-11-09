package week9;

public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override 
	public boolean equals(Object obj){
		if (!(obj instanceof Point))
			return false;
		Point p = (Point) obj;
		return x == p.x && y == p.y;
	}
	
	@Override
	public int hashCode(){
		int result = 18;
		result = 37 * result + x;
		result = 37 * result + x;
		return result;
	}
}
