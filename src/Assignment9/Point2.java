
public class Point2 {
	
	private int x;
	private int y;
	
	public Point2(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Point2))
			return false;
		Point2 tmp = (Point2) obj;
			return (tmp.getX() == this.getX()) && (tmp.getY() == this.getY());
					
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}

}
