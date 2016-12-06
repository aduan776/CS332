public enum Rocks {

	DIAMOND(10, 80000000), QUARTZ(7, 555555), APATITE(5, 5555), TALC(1, 555);

	private final int hardness;
	private final int costPerPound;

	Rocks(int hardness, int costPerPound) {
		this.hardness = hardness;
		this.costPerPound = costPerPound;
	}

	public int getCostWithPounds(int pounds) {
		return costPerPound * pounds;
	}

	public int getHardness() {
		return hardness;
	}
}
