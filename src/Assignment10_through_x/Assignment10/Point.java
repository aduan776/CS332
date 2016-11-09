public class Point implements PointInterface {

	//TODO:You guys can also delete this.
	public static void main(String[] args) {
		Point p = new Point(1,3);
		Point z = new Point(1,3);
		System.out.println(p.equals(z));
	}

	private final int x;
	private final int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PointInterface))
			return false;
		if (!(obj instanceof Point))
			return false;
		Point p = (Point) obj;
		return x == p.x && y == p.y;
	}
	
	@Override 
	public int hashCode(){
		int result = 18;
		result = 37 * result + x;
		result = 37 * result + y;
		return result;
	}

	//TODO: You guys can delete this, I was just using this for testing something
	@Override
	public void whoAmI() {
		System.out.println("I am Point");
	}
	
}
