public class ClientCodeCStyleEnum {

	public static void main(String[] args) {
		int pounds = 5;
		for (int i = 3; i >= 0; i --){
			switch(i){
			case 0:
				System.out.printf("%s for %d pounds is %d\n", getRockName(i), pounds, CStyleEnum.getCostWIthPounds(pounds, i));
				break;
			case 1:
				System.out.printf("%s for %d pounds is %d\n", getRockName(i), pounds, CStyleEnum.getCostWIthPounds(pounds, i));
				break;
			case 2:
				System.out.printf("%s for %d pounds is %d\n", getRockName(i), pounds, CStyleEnum.getCostWIthPounds(pounds, i));
				break;
			case 3:
				System.out.printf("%s for %d pounds is %d\n", getRockName(i), pounds, CStyleEnum.getCostWIthPounds(pounds, i));
				break;
			}
		}
		System.out.println();
		for (int i = 3; i >= 0; i --){
			switch(i){
			case 0:
				System.out.printf("%s for %d pounds is %d\n", getRockName(i), pounds, CStyleEnum.getHardness(i));
				break;
			case 1:
				System.out.printf("%s for %d pounds is %d\n", getRockName(i), pounds, CStyleEnum.getHardness(i));
				break;
			case 2:
				System.out.printf("%s for %d pounds is %d\n", getRockName(i), pounds, CStyleEnum.getHardness(i));
				break;
			case 3:
				System.out.printf("%s for %d pounds is %d\n", getRockName(i), pounds, CStyleEnum.getHardness(i));
				break;
			}
		}
	}
	
	public static String getRockName(int ROCK){
		switch(ROCK){
		case 0:
			return "TALC";
		case 1:
			return "APATITE";
		case 2:
			return "QUARTZ";
		case 3:
			return "DIAMOND";
		default:
			throw new IllegalArgumentException("ClientCodeCStyleEnum.getRockName");
		}
	}
}
