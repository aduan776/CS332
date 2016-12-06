public class JavaEnumStyleClientCode {

	public static void main(String[] args) {
		int pounds = 5;
		for (Rocks r : Rocks.values()) {
			System.out.printf("%s for %d pounds is %d\n", r, 5, r.getCostWithPounds(pounds));
		}
		System.out.println();
		for (Rocks r : Rocks.values()) {
			System.out.printf("%s has hardness of %d\n", r, r.getHardness());
		}
	}
}
