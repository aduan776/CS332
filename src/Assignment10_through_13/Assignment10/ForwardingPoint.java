public class ForwardingPoint implements PointInterface {

	private final PointInterface p;

	public ForwardingPoint(PointInterface p) {
		this.p = p;
	}

	public ForwardingPoint(int x, int y) {
		p = new Point(x, y);
	}

	public boolean equals(Object obj) {
		return p.equals(obj);
	}

	public int hashCode() {
		return p.hashCode();
	}

	//TODO:go ahead and delete this if you want
	@Override
	public void whoAmI() {
		System.out.println("I am forwardingPoint");
	}

}
