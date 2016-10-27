import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ClientClass {

	public static void main(String[] args) {
		HashSet<List<Integer>> hSet = new HashSet<List<Integer>>();
		TreeSet<List<Integer>> tSet = new TreeSet<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5));
	}

	class Comparator<Integer> implements Comparable<Integer> {
		Integer i;
		public Comparator(Integer e)
		{
			this.i = e;
		}
		@Override
		public int compareTo(Integer o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
}

