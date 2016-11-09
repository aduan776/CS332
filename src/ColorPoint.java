import java.util.HashMap;
import java.util.Map;

public class ColorPoint extends Point {  // First attempt: Standard recipe
	public enum COLOR {
	    RED(0), ORANGE(1), YELLOW(2), GREEN(3), BLUE(4),
	    PURPLE(5), BROWN(6), GREY(7), WHITE(8), BLACK(9);
	    private int value;
	    private static Map map = new HashMap<>();

	    private COLOR(int value) {
	        this.value = value;
	}
	}
	private COLOR color;
   
  public ColorPoint(int x, int y , COLOR color)
  {
	  super(x,y);
	  this.color = color;
  }
  @Override public boolean equals(Object obj) {
      if (!(obj instanceof ColorPoint)) return false;

      ColorPoint cp = (ColorPoint) obj;
      return super.equals(obj) && cp.color == color;
   }
  @Override public int hashCode()
  {
	  int hashcode = super.hashCode();
	  hashcode = hashcode*31 + color.value;
	  return hashcode;
  }
}