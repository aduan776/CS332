public class CStyleEnum {
	public static final int DIAMOND = 3;
	public static final int QUARTZ = 2;
	public static final int APATITE = 1;
	public static final int TALC = 0;

	public static int getHardness(int ROCK) {
		switch (ROCK) {
		case 0:
			return 1;
		case 1:
			return 5;
		case 2:
			return 7;
		case 3:
			return 10;
		default:
			throw new IllegalArgumentException("CStyleEnum.getHardness");
		}
	}

	public static int getCostWIthPounds(int pounds, int ROCK) {
		switch (ROCK) {
		case 0:
			return getCostPerPound(ROCK) * pounds;
		case 1:
			return getCostPerPound(ROCK) * pounds;
		case 2:
			return getCostPerPound(ROCK) * pounds;
		case 3:
			return getCostPerPound(ROCK) * pounds;
		default:
			throw new IllegalArgumentException("getCostWithPounds");
		}
	}

	public static int getCostPerPound(int ROCK) {
		switch (ROCK) {
		case 0:
			return 555;
		case 1:
			return 5555;
		case 2:
			return 555555;
		case 3:
			return 80000000;
		default:
			throw new IllegalArgumentException("CStyleEnum.getHardness");
		}
	}
}
