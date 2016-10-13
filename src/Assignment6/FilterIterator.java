import java.util.ArrayList;
import java.util.Iterator;

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
