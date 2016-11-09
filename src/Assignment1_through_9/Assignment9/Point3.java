
public class Point3 extends Point2{
	
	private int z;
	
	public Point3(int x, int y, int z)
	{
		super(x, y);
		this.z = z;
	}

	public boolean equals(Object p) { // overridingdeﬁnition
		if (p instanceof Point3)
			return equals((Point3) p);
		return super.equals(p);
	}

	public boolean equals(Point2 p) { // overridingdeﬁnition
		if (p instanceof Point3)
			return equals((Point3) p);
		return super.equals(p);
	}

	public boolean equals(Point3 p) { // extradeﬁnition
		if (p == null || z != p.z)
			return false;
		return super.equals(p);
	}

}
