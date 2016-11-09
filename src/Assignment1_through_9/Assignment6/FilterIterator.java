import java.util.ArrayList;
import java.util.Iterator;

/* Contributions:
 * Alex Duan wrote the crux of the FilterIterator class. He was the first to figure out what the requirements were actually truly asking for
 * and started to code. He also helped discuss the assignment and make sure everyone understood clearly of what was to be completed.
 *
 * Pyoung Kang Kim helped pair program by suggesting ideas on how to implement the code and making sure requirements were met such
 * as generics, correct method implementation and just gave another eye. He also wrote majority of the JUnit Test cases.
 *
 * Daniel Quintero wrote the Check Class and also helped discuss the assignment. He also helped review the code to make sure things were 
 * implemented correctly. Afterwards he wrote a couple JUnit Test cases as well.
 */


public class FilterIterator<E> implements Iterator<E> {
	Iterator<E> iter;

	public static <E> Iterator<E> filter(Iterator<E> g, Check<E> x) throws NullPointerException {
		ArrayList<E> list = new ArrayList<E>();
		if (g == null)
			throw new NullPointerException();
		else {
			while (g.hasNext()) {
				E tmp = g.next();
				if (x.checker(tmp)) {
					list.add(tmp);
				}
			}
		}
		return new FilterIterator<E>(list);
	}

	public FilterIterator(Iterable<E> iter) {
		this.iter = iter.iterator();
	}

	@Override
	public boolean hasNext() {
		return iter.hasNext();
	}

	@Override
	public E next() {
		return iter.next();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
