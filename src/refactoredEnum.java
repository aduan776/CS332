
public class refactoredEnum {
	enum Mass {
		   GRAM(1),DECAGRAM(10),HECTOGRAM(100),KILOGRAM(1000),MEGAGRAM(1000000);
		   private int m;
		   Mass(int m) {
		      this.m = m;
		   }
		   int getMass() {
		      return m;
		   } 
		}
}
