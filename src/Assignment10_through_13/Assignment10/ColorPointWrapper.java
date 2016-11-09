import java.awt.Color;

public class ColorPointWrapper extends ForwardingPoint {
	private final Color color;
	
	public ColorPointWrapper(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	//TODO: going to the gym guys..
	@Override 
	public boolean equals(Object obj){
		return false;
	}
	
	@Override
	public int hashCode(){
		int result = 19;
		result = 37 * result * super.hashCode();
		result = 37 * result + color.hashCode();
		return super.hashCode() + color.hashCode();
	}
}
